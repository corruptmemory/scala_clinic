// Nifty trick to subset matchers
sealed trait Foo
sealed trait Bar
case class IntFoo(x:Int) extends Foo
case class DoubleFoo(x:Double) extends Foo with Bar
case object DeadFoo extends Foo with Bar

val x:Bar = DeadFoo // Notice no 'new' here

val y = x match {
    case DoubleFoo(_) => "got double"
    case DeadFoo => "He's dead, Jim."
  }
