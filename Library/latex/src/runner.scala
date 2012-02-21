object Runner {
  def run {
    val pinger:Actor = (new Pinger()).start()
    val ponger:Actor = (new Ponger(10,pinger)).start()
    ponger ! Ping
  }
}