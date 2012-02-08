val f1:PartialFunction[Option[String],String] = {
  case Some("George") => "you're somebody"
  case Some("Sam") => "you're somebody"
  case Some("Desmond") => "you're somebody"
}

val f2:PartialFunction[Option[String],String] = {
  case Some("Tom") => "you're Tom"
  case Some(_) => "you're nobody"
  case None => "you're not even there"
}

val f3 = f1 orElse f2

f3(Some("George")) // ->> "you're somebody"
f3(Some("Tom")) // ->> "you're Tom"
f3(None) // "you're not even there"
