class Foo(x:Int,y:Int) {
  class Bar {
    val d = x - y
    def diff = d
  }
  private val s = x + y
  def sum = s
}

// Usage
val f = new Foo(1,2)
f.sum // ->> 3
val g = new f.Bar
g.diff // ->> -1
