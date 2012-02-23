object Test {
  implicit def secondsTo(x:Double) = new {
    def millis = x * 1000.0
    def tenths = x * 10.0
    def minutes = x/60.0
    def hours = x/3600.0
    def days = x/(3600.0*24.0)
  }

  def test:String = {
    val t = 12345.0
    "%f days, %f hours, %f minutes, %f seconds, %f tenths, %f ms".format(
      t.days,
      t.hours,
      t.minutes,
      t,
      t.tenths,
      t.millis)
  }
}

Test.test // ->> "0.142882 days, 3.429167 hours, 205.750000 minutes, 12345.000000 seconds, 123450.000000 tenths, 12345000.000000 ms"