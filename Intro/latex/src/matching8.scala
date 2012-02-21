val x:Map[String,String] = // ...

val y = x.get("first") match {
  case None => Some("<NO NAME>")
  case x@Some(_) => x
}
