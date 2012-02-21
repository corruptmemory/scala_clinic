package my.foo

class Foo {
  private val x = 5 // Only visible inside the class
  protected def foo = "foo" // visible to sub-types
  def bar = foo // Public
  final val tt = 99 // cannot be over-ridden
  private[foo] pFoo = new Integer(45) // private outside the module my.foo
}
