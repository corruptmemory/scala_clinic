object Test {
  class Foo[+T](val x:T)

  val x:Foo[Object] = new Foo[Object](new Object)
  // Compiles!
  val y:Foo[Object] = new Foo[String]("Compiles!")
  // Won't compile
  val z:Foo[String] = new Foo[Object]("Won't compile!")
}