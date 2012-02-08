val x = List(1,2,3) // x:List[Int]
val y = List(1,"2",(3,4)) // y:List[Any]
val z = 1::2::3::Nil // z:List[Int]

// Pattern matching
val w = x match {
  case Nil => -1
  case h::t => h // h:Int, t:List[Int]
}
