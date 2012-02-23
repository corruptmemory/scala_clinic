object Test {
  val v = Vector(1,2,3,4,5,6,7,8,9,10)
  def sillyAdd(x1:Int,x2:Int) =
    v map (_ + x1) map (_ + x2)
  // The above creates 2 copies
}