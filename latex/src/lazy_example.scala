import java.util.Date

class Foo {
  val dt1 = new Date
  lazy val dt2 = new Date
  def dumpDates {
    println("dt1: %s".format(dt1))
    println("dt2: %s".format(dt2))
  }
}

val f = new Foo
// Wait a few seconds
f.dumpDates
/** Example output:
 *    dt1: Tue Feb 07 22:48:31 EST 2012
 *    dt2: Tue Feb 07 22:48:39 EST 2012
 */
