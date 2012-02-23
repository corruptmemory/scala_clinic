object Test {
  implicit val inTail:List[Int] =
    List(-1,-2,-3)

  implicit val stringTail:List[String] =
    List("A","B","C")

  def sillyLists[T](x:T)(implicit t:List[T]) =
    x::t

  def makeSillyLists[T : List](x:T) =
    sillyLists(x)

  val v1 = makeSillyLists(1)
  val v2 = makeSillyLists("Better")
  // Won't compile
  val v3 = makeSillyLists(1.0)
// error: could not find implicit value for evidence parameter of type List[Double]
//          val v3 = makeSillyLists(1.0)
}