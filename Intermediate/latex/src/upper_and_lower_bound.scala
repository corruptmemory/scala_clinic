object Test {
  trait Top {
    val tehBaz = "I'm the tops!"
  }
  trait Baz extends Top {
    override val tehBaz = "Whoa yeah!"
  }

  class Topsy extends Top
  class Bad extends Baz
  class Goo extends Bad {
    override val tehBaz = "Hell's yeah!"
  }
  class Foo[T >: Goo <: Baz] {
    def apply(x:T) = x.toString
  }

  // all good!
  val f1 = (new Foo[Bad])(new Bad)
  // Won't compile
  val f2 = (new Foo[Goo])(new Goo)
  // Won't compile
  val f3 = (new Foo[Topsy])(new Topsy)
}