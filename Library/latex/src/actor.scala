import scala.actors.Actor, Actor._
import java.lang.Thread._

case object Ping
case object Pong
case object Stop

class Ponger(count:Int,pinger:Actor) extends Actor {
  def act() {
    var c = count
    var continue = true
    while (continue) {
      receive {
        case Ping =>
          println("PING: %d".format(c))
          sleep(1000)
          c -= 1
          if (c > 0) pinger ! Pong
          else {
            pinger ! Stop
            continue = false
          }

      }
    }
  }
}

class Pinger extends Actor {
  def act() {
    var continue = true
    while (continue) {
      receive {
        case Pong =>
          println("PONG")
          sleep(1000)
          sender ! Ping
        case Stop =>
          println("Stopping")
          continue = false
      }
    }
  }
}

object Runner {
  def run {
    val pinger:Actor = (new Pinger()).start()
    val ponger:Actor = (new Ponger(10,pinger)).start()
    ponger ! Ping
  }
}