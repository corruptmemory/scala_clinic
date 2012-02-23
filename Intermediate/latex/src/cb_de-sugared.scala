object Test {
  implicit val inTail:List[Int] =
    List(-1,-2,-3)

  implicit val stringTail:List[String] =
    List("A","B","C")

  def sillyLists[T](x:T)(implicit t:List[T]) =
    x::t

  def makeSillyLists[T](x:T)(implicit t:List[T]) =
    sillyLists(x)

  val v1 = makeSillyLists(1)(inTail)
  val v2 = makeSillyLists("Better")(stringTail)
}