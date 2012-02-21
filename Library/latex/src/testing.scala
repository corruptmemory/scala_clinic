import scala.testing.Show

class Foo {
  def foo(i:Int):Int = i+1
}

object TestRunner extends Show {
  val f = new Foo
  def testFoo(i:Int):Int = f.foo(i)
  def tester {
    println(test('testFoo,5))
  }
}