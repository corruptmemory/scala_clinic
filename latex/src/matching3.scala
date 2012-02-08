// Alternates allowed

val x = 10

val y = x match {
  case 0 => "none"
  case 1 => "single"
  case 2 => "couple"
  case 3 => "few"
  case 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 => "several"
  case 12 => "dozen"
  case _ => "many"
}
