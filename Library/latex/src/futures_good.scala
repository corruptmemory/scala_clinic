import scala.Responder
import scala.actors.{Future,Futures}, Futures._
import java.lang.Thread._

object TehFutureWoooo {
  def testGood:Responder[Int] = {
    val x = future {
      sleep(1000)
      5
    }
    println("Before")
    for (i <- x) yield {
      println("Inside: %d".format(i))
      i + 1
    }
  }
  def runner =
    for (i <- testGood) {
      println("After: %d".format(i))
    }

}