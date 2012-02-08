// Match with guard

val x:Option[Int] = Some(10)

val y = x match {
  case None => "none"
  case Some(z) if z > 5 => "something greater than five"
  case Some(z) if z <= 5 => "something less than or equal to five"
}
