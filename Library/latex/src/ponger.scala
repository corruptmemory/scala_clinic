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