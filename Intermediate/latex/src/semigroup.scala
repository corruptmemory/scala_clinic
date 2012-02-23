abstract class Semigroup[T,M[_]] {
  def append(x:M[T],xs:M[T]):M[T]
}