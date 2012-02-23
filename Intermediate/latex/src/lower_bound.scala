object Test {
  trait Baz {
    val tehBaz = "Whoa yeah!"
  }

  class Bad extends Baz
  class Goo extends Bad {
    override val tehBaz = "Hell's yeah!"
  }
  class Foo[T >: Bad] {
    def apply(x:T) = x.toString
  }

  // all good!
  val f1 = (new Foo[Bad])(new Bad)
  // Won't compile
  val f2 = (new Foo[Goo])(new Goo)
}