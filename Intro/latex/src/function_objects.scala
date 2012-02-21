// You can use singleton objects
object Foo {
  def apply(x:Int) = x.toString
}

// Or instances
class Bar {
  def apply(x:Int) = x.toString
}

val b = new Bar
b(5) // ->> "5"
