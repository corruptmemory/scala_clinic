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