import scala.actors.Futures._
import java.lang.Thread._

object TehFutureWoooo {
  def testBad {
    val x = future {
      sleep(1000)
      5
    }
    println("Before")
    println(x())
    println("After")
  }
}