val f1:PartialFunction[Option[String],String] = {
  case Some("George") => "you're somebody"
  case Some("Sam") => "you're somebody"
  case Some("Desmond") => "you're somebody"
}

f1(Some("George")) // ->> "you're somebody"
f1(Some("Tom")) // ->> Exception!
