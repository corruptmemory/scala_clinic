trait Baz {
  val x:Int; val y:Int // Abstract values
  trait Bad {
    def product = x * y
  }
  def diff = x - y
}

class Foo(val x:Int,val y:Int) extends Baz {
  def bad = new Bad {} // type Baz#Bad
  def sum = x + y
}

// Usage
val f = new Foo(1,2)
val b = f.bad
b.product // ->> 2
