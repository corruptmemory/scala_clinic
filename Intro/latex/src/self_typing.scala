class Foo(val x:Int)

trait Bar { self:Foo=> // Bar can only be mixed
  def bar = self.x+5   // into a subclass of Foo
}

class Baz(x:Int) extends Foo(x) with Bar

val b = new Baz(9)
b.bar // ->> 14
