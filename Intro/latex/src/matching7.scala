val x:Map[String,String] = // ...

val y = (x.get("first"),x.get("last")) match {
  case (None,Some(_)) | (Some(_),None) => "clearly a celebrity"
  case _ => "Normal Joe"
}
