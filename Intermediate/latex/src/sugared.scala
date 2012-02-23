object Test {
  class Height[S](v:S,f:S => Int) {
    def height:Int = f(v)
  }

  implicit def stringToHeight(s:String):Height[String] =
    new Height(s,_.length)

  def sillyLength[A <% Height[A]](x:A) =
    x.height
}