object Test {
  class Foo(val value:Int)
  object Foo {
    implicit def fooToInt(f:Foo):Int = f.value
  }

  val v1:Foo = new Foo(10)
  val v2:Int = v1
}