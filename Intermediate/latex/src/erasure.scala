object Test {
  def whatDoIHave(l:List[_]):String = l match {
    case _:List[Int] => "List of int"
    case _:List[Double] => "List of double"
    case _:List[String] => "List of String"
    case _:List[Byte] => "List of byte"
    case _ => "I don't know"
  }

  val v1 = whatDoIHave(List(1,2,3)) // => List of int
  val v2 = whatDoIHave(List(1.0,2.0,3.0)) // => List of int :-(
}