// Anonymous Functions
val f:Int => String = (x => x.toString)
val f:Int => String = {x => x.toString}
val f:Int => String = {
  x => x.toString
}

// Using the all powerful _
val g:Int => String = _.toString

// Using the all powerful _ blech type-inferencing
val h = (_:Int).toString

// Closures
def foo(x:Int):Int => Int = (_ + x)

// Nested
def fact(n:Int):Int = {
  def factN(n:Int,out:Int):Int =
    if (n <= 1) out
    else factN(n-1,out*n)
  factN(n,1)
}
