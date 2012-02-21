import java.lang.{Integer => JInt}
class Foo(x:Int,y:Int) {
  def this(xs:String,ys:String) = // alternate constructor
    this(JInt.parse(xs.trim),JInt.parse(ys.trim))
  private val s = x + y
  def sum = s
}
