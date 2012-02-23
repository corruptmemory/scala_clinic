object Test {
  class Greeter(name:String) {
    def greet(implicit prefix:String) =
      "%s, %s".format(prefix,name)
  }

  object Greeter {
    implicit val prefix = "Howdy!"
  }

  def run {
    import Greeter._
    val g = new Greeter("jim")
    println(g.greet)
  }
}