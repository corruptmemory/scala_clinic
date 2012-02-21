def time[T](message:String)(block: => T):T = {
  val start = System.nanoTime
  val result = block
  val end = System.nanoTime
  println("%s: %d".format(message,end-start))
  result
}

// Notice that the second argument is a block
time("Testing Thread.sleep") {
  Thread.sleep(1000)
}
