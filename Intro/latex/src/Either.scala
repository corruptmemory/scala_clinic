val x = Left[Int,String](1) // x:Left[Int,String]
val y = Right[Int,String]("hello") // y:Right[Int,String]
val z:Either[Int,String] = Right("ZZZZ")

def foo(t:Either[Int,String]):Unit = t match {
    case Left(x) => println("Left(%d)".format(x))
    case Right(x) => println("Right(%s)".format(x))
  }

foo(x) // ->> Left(1)
foo(y) // ->> Right(hello)
foo(z) // ->> Right(ZZZZ)
