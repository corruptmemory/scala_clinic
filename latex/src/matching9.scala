trait Foos
class IntFoo(val x:Int) extends Foos
class DoubleFoo(val x:Double) extends Foos
class StringFoo(val x:String) extends Foos

def show(y:Foos):String = y match {
  // If you are going to check for null, you MUST do it first
  case null => "Do I have a sign saying 'Dead Null Storage'?"
  case a:IntFoo => "IntFoo(%d)".format(a.x)
  case a:DoubleFoo => "DoubleFoo(%f)".format(a.x)
  case a:StringFoo => "StringFoo(%s)".format(a.x)
  // Order matters. _ must always be last
  case _ => "Say 'What?' one more time! I dare you! I double-dare you!"
}
