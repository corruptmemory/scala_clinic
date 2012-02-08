val coolNames = Set("george","sam","desmond")

val f1:PartialFunction[Option[String],String] = {
  case Some(x) if coolNames(x.toLowerCase) => "you're somebody"
}

f1(Some("George")) // ->> "you're somebody"
f1(Some("Tom")) // ->> Exception!
