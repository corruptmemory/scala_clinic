abstract class Monoid[T,M[_]] {
  def identity(x:T):M[T]
  def append(x:M[T],xs:M[T]):M[T]
}