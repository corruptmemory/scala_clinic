object Test {
  trait Baz {
    val tehBaz = "Whoa yeah!"
  }

  class Foo[T <: Baz] {
    def apply(x:T) = x.tehBaz
  }

  class Bad extends Baz
  class Goo extends Bad {
    override val tehBaz = "Hell's yeah!"
  }
  class Garg {
    val tehBaz = "Wha wha!"
  }

  // all good!
  val f1 = (new Foo[Bad])(new Bad)
  val f2 = (new Foo[Goo])(new Goo)
  // Won't compile
  val f3 = (new Foo[Garg])(new Garg)
}