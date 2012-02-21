// More general example
class Foo(x:Int,y:Int) { // Defines the beginning of the
  private val s = x + y  // constructor body
  def sum = s
}

class Bar(x:Int,y:Int) extends Foo(x,y) {
  private val d = x - y
  def diff = d
}
