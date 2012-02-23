object Test {
  implicit def intToString(i:Int):String = i.toString

  def ish(s:String) = s+"-ish"

  def test = ish(5)
}