object Test {
  abstract class Foo[-T,+V] {
    def apply(x:T):V
  }

  val x = new Foo[String,Int] {
    def apply(x:String):Int = x.length
  }

  val y = new Foo[Object,Int] {
    def apply(x:Object):Int = -1
  }

  // Compiles!
  val z:Foo[String,Int] = y

  // Won't compile
  val w:Foo[Object,Int] = x
}