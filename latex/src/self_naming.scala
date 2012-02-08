// Self-naming class
class Foo(val x:Int) { self=> // Now 'this' is called 'self'
  def dup = new Foo(self.x)
}

// Self-naming trait
trait Bar { self=> // Now 'this' is called 'self'
  val x:Int
  def dup = new Bar { 
    val x:Int = self.x
  }
}
