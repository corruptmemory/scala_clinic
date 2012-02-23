object Test {
  abstract class Monoid[T,M[_]] {
    def identity(x:T):M[T]
    def append(x:M[T],xs:M[T]):M[T]
  }

  implicit def listMonoid[T]:Monoid[T,List] = new Monoid[T,List] {
    def identity(x:T):List[T] = List(x)
    def append(x:List[T],xs:List[T]):List[T] = xs ++ x
  }
  implicit def vectorMonoid[T]:Monoid[T,Vector] = new Monoid[T,Vector] {
    def identity(x:T):Vector[T] = Vector(x)
    def append(x:Vector[T],xs:Vector[T]):Vector[T] = xs ++ x
  }

  def append[T,M[_]](x:T,xs:M[T])(implicit m:Monoid[T,M]):M[T] =
    m.append(m.identity(x),xs)

  val v1:List[Int] = append(1,List(-1,-2,-3))
  val v2:Vector[Int] = append(1,Vector(-1,-2,-3))
}