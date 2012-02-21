class Foo[T](val x:T, show:T => String) {
  type TheType = T
  def foo:String = show(x)
}

object FooTest {
  def main(args:Array[String]) {
    val f = new Foo(50,(_:Int).toString)
    val g:f.TheType = 100
    import f._
    println(foo) // ->> "50"
  }
}
