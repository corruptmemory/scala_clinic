case class Name(first:String,middle:Option[String],last:String)

// Name(Thomas,Some(Alva),Edison)
val n1 = Name("Thomas",Some("Alva"),"Edison")
// Name(Thomas,Some(Tupac),Edison)
val n2 = n1.copy(middle = Some("Tupac"))
