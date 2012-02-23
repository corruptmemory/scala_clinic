object Test {
  class Foo[T](val x:T)

  val x:Foo[Object] = new Foo[Object](new Object)
  // Won't compile
  val y:Foo[Object] = new Foo[String]("Won't compile!")
//  error: type mismatch;
//  found   : Test.Foo[String]
//  required: Test.Foo[java.lang.Object]
// Note: String <: java.lang.Object, but class Foo is invariant in type T.
// You may wish to define T as +T instead. (SLS 4.5)
//          val y:Foo[Object] = new Foo[String]("Won't compile!")
}