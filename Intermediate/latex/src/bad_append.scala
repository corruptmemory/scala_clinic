object Test {
  def appendList[T](x:T,xs:List[T]):List[T] = xs :+ x
  def appendVector[T](x:T,xs:Vector[T]):Vector[T] = xs :+ x
  // Repeat for all things you are interested in ...

  // Can't we just do:
  def append[T,M[_]](x:T,xs:M[T]):M[T] = xs :+ x
  // Won't compile :-(
}