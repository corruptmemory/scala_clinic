// This can also be a class
sealed trait Foo
case class IntFoo(x:Int) extends Foo
case class DoubleFoo(x:Double) extends Foo
case object DeadFoo extends Foo

val x:Foo = IntFoo(4) // Notice no 'new' here

val y = x match {
    case IntFoo(_) => "got int"
    case DoubleFoo(_) => "got double"
    case DeadFoo => "He's dead, Jim."
  }

// Compiler will generate a warning that the match is not exhaustive
val z = x match {
    case IntFoo(_) => "got int"
  }

// Compiler happy now
val w = x match {
    case IntFoo(_) => "got int"
    case _ => "don't care"
  }
