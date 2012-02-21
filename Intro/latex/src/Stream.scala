def from(n: Int): Stream[Int] =
   Stream.cons(n, from(n + 1))
def sieve(s: Stream[Int]): Stream[Int] =
  Stream.cons(s.head, sieve(s.tail filter { _ % s.head != 0 }))
def primes = sieve(from(2))

primes take 10 print // -> 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
