object Test {
  class TypeMatch[T](implicit m:Manifest[T]) {
    def unapply(x:Manifest[_]):Option[Boolean] =
      if (x <:< m) Some(true)
      else None
  }
  def typeMatch[T : Manifest]:TypeMatch[T] = new TypeMatch[T]

  val listInt = typeMatch[List[Int]]
  val listDouble = typeMatch[List[Double]]
  val listString = typeMatch[List[String]]
  val listByte = typeMatch[List[Byte]]

  def whatDoIHave[T](l:List[T])(implicit m:Manifest[List[T]]):String = m match {
    case listInt(_) => "List of int"
    case listDouble(_) => "List of double"
    case listString(_) => "List of String"
    case listByte(_) => "List of byte"
    case _ => "I don't know"
  }

  val v1 = whatDoIHave(List(1,2,3)) // => List of int
  val v2 = whatDoIHave(List(1.0,2.0,3.0)) // => List of int :-(
}