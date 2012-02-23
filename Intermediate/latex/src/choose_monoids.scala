object Test {
  abstract class Monoid[T,M[_]] {
    def identity(x:T):M[T]
    def append(x:M[T],xs:M[T]):M[T]
  }
  case class Id[T](value:T)
  implicit def toId[T](x:T):Id[T] = Id(x)
  implicit def fromId[T](x:Id[T]):T = x.value

  implicit def intPlusMonoid:Monoid[Int,Id] = new Monoid[Int,Id] {
    def identity(x:Int):Id[Int] = Id(x)
    def append(x:Id[Int],xs:Id[Int]):Id[Int] = Id(xs.value + x.value)
  }

  def intMultMonoid:Monoid[Int,Id] = new Monoid[Int,Id] {
    def identity(x:Int):Id[Int] = Id(x)
    def append(x:Id[Int],xs:Id[Int]):Id[Int] = Id(xs.value * x.value)
  }

  def append[T,M[_]](x:T,xs:M[T])(implicit m:Monoid[T,M]):M[T] =
    m.append(m.identity(x),xs)

  // Uses plus
  val v1:Int = append[Int,Id](1,2)
  // Uses mult
  val v2:Int = append[Int,Id](1,2)(intMultMonoid)
}