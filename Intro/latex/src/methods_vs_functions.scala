object Namer {
  // Default arguments
  def fullName(first:String, last:String, middle:Option[String] = None):String =
    middle map (m => "%s %s %s".format(first,m,last)) getOrElse "%s %s".format(first,last)
  // Variable arguments
  def spaniardName(first:String,rest:String*):String =
    "%s, %s".format(first,rest.mkString(", "))
}

fullName("Jim","Powers") // ->> "Jim Powers"
fullName("Thomas","Edison",Some("Alva")) // ->> "Thomas Alva Edison"

// Named parameters
fullName(last = "Einstein",first = "Albert") // ->> "Albert Einstein"
