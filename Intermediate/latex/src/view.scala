object Test {
  val v = Vector(1,2,3,4,5,6,7,8,9,10)
  def betterSillyAdd(x1:Int,x2:Int) =
    (v.view map (_ + x1) map (_ + x2)).force
  // The above creates 1 copy
}