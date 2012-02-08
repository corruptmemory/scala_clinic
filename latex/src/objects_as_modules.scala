object Foo { // Declares a singleton object
  def myPrintln(x: Any) {
    print("MY: ")
    println(x)
  }
}

object Bar {
  import Foo._
  def printTest {
    myPrintln("This is a test")
    Foo.myPrintln("This is a test1")
  }
}
