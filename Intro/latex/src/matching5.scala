// Mixed Extractor/Value match

val x:Option[Int] = Some(10)

val y = x match {
  case null => "Nulls are *so* Java."
  case None => "none"
  case Some(z) => z.toString
}
