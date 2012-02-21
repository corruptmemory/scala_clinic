val x = Some(1) // x:Some[Int]
val y:Option[Int] = None 

def foo(t:Option[Int]):Unit = t match {
  case None => println("got nothing")
  case Some(_) => println("got something")
}

foo(x) // ->> got something
foo(y) // ->> got nothing
