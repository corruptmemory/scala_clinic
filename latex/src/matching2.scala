// "otherwise" simple values

val x = 10

val y = x match {
  case 0 => "zero"
  case 1 => "one"
  case 2 => "two"
  case 3 => "three"
  case 4 => "four"
  case 5 => "five"
  case _ => "something other than [0-5]"
}
