import scala.sys.process.{Process,ProcessIO}

object Lister {
  val ls = Process("ls")
  val pio = new ProcessIO(_ => (),
                          stdout => scala.io.Source.fromInputStream(stdout)
                            .getLines.foreach(println),
                          _ => ())
  def runner {
    ls.run(pio)
  }
}
