// Extractor match

val x:Option[Int] = Some(10)

val y = x match {
  case None => "none"
  case Some(z) => z.toString
}
