class Foo {
  private val x:Long = 10
  def getX = x
}

def genFoo(flip:Boolean) =
  if (flip) new Foo
  else new Foo {
    private val x:Long = System.nanoTime
    override def getX = x
  }

val f1 = genFoo(true)
val f2 = genFoo(false)

f1.getX // ->> 10
f2.getX // ->> Example: 126869683761878
