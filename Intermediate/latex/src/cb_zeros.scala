object Test {
  class Zero[T](val value:T)

  def zero[T](implicit z:Zero[T]):T = z.value

  implicit def intZero:Zero[Int] = new Zero(0)
  implicit def stringZero:Zero[String] = new Zero("")

  def accept[T : Zero](v:T,f:T => Boolean):T =
    if (f(v)) v else zero

  def stringTest(s:String):Boolean = s.length < 3
  def intTest(i:Int):Boolean =  (i % 5) == 0

  // ->  List("", 12, "")
  val v1 = List("12345","12","123").map(x => accept(x,stringTest _))
  // -> Vector(0, 0, 0, 0, 5, 0, 0, 0, 0, 10)
  val v2 = (1 to 10).map(x => accept(x,intTest _))
}