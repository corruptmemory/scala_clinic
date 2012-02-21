def foo(x:{val bar:Int}) = 5 + x.bar

class Bar {
  val bar = 5
}

class Bad {
  val bar = 9
}

class Baz {
  val baz = 9
}

foo(new Bar())
foo(new Bad())
foo(new Baz()) // << Does not compile
