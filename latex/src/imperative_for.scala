for { i <- 0 to 100
      j <- i to 100 } {
      println("i+j = %d".format(i+j))
    }

// Translates to
Range.inclusive(1,100).foreach { i => 
  Range.inclusive(i,100).foreach { j => 
    println("i+j = %d".format(i+j))
  }
}
