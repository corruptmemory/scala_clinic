trait Foo { this:Bar => // 'self' annotation with type
  override def bar(x:Int) = x + 2
}

class Bar {
  def bar(x:Int) = x + 1
}

val b = new Bar with Foo
b.bar(10) // ->> 12
