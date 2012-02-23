object Test {
  class Height[S](v:S,f:S => Int) {
    def height:Int = f(v)
  }

  implicit def stringToHeight(s:String):Height[String] =
    new Height(s,_.length)

  def sillyLength[A](x:A)(implicit f:A => Height[A]) =
    f(x).height
}