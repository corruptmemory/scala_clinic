object Namer {
  // Default arguments
  def fullName(first:String, last:String, middle:Option[String] = None):String =
    middle map (m => "%s %s %s".format(first,m,last)) getOrElse "%s %s".format(first,last)
  // Variable arguments
  def spaniardName(first:String,rest:String*):String =
    "%s, %s".format(first,rest.mkString(", "))
}

import Namer._
// <method> _ -> function

// fn: (String, String, Option[String]) => String
val fn = fullName _ 
// sn: (String, String*) => String
val sn = spaniardName _
