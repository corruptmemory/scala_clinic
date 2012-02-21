import scala.util.parsing.combinator.syntactical._
import scala.util.parsing.combinator.{PackratParsers,RegexParsers}

class ExpressionParser extends RegexParsers with PackratParsers {
  val ws = "\\s*".r ^^ {_ => ()}
  val number = ws ~> "-?\\d+".r ^^ {x => x}
  val termOp = ws ~> "\\+|-".r ^^ { 
    case "+" => "ADD"
    case "-" => "SUBTRACT"
  }
  val prodOp = ws ~> "\\*|/".r ^^ { 
    case "*" => "MULT"
    case "/" => "DIVIDE"
  }
  def exp:Parser[String] = number ~ prodOp ~ exp <~ ws ^^ {case l ~ op ~ r => "%s(%s,%s)".format(op,l,r)} | number
  def term:Parser[String] = exp ~ termOp ~ term <~ ws ^^ {case l ~ op ~ r => "%s(%s,%s)".format(op,l,r)} | exp
  def test(s:String) {
    println(parseAll(term,s))
  }
}
