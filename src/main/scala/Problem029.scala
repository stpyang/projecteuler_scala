import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting.quickSort

/**
 * Created by stpyang on 5/1/14.
 */
object Problem029 {
  def apply(n: Int) = new Problem029(n)

  def main(args: Array[String]) = println(Problem029(100).solve)

  def lt(x: List[Int], y: List[Int]): Boolean = {
      if (x == y) return false
      else if (x.isEmpty && y.isEmpty) false
      else if (x.length != y.length) x.length < y.length
      else if (x(0) != y(0)) x(0) < y(0)
      else lt(x.tail, y.tail)
    }
}

class Problem029(n: Int) {
  // instead of keeping track of a^b,
  // we keep track of the prime factorization of a^b using a vector of exponents
  // since a <= N, we only need to know the prime numbers up to and including N

  @tailrec private def getExponents(primes: List[Int], exponents: List[Int], n: Int): List[Int] = {
    if (primes.isEmpty) exponents
    else if (n % primes.head != 0) getExponents(primes.tail, 0 :: exponents, n)
    else getExponents(primes, (exponents.head + 1) :: exponents.tail, n / primes.head)
  }

  def getExponents(primes: List[Int], n: Int): List[Int] = getExponents(primes, List[Int](0), n)

  def solve = {
    val primeSieve = new PrimeSieve(n)
    val primes = (2 to n).filter(primeSieve.isPrime).toList

    val exponents = ArrayBuffer[List[Int]]()
    (2 to n).foreach(a => {
      val baseExponents = getExponents(primes, a)
      (2 to n).foreach(b => {
         exponents += (for (i <- baseExponents) yield b * i)
      })
    })

    val sortedExponents = exponents.sortWith(Problem029.lt)

    1 + (1 until sortedExponents.length).count(i => { !sortedExponents(i - 1).corresponds(sortedExponents(i))(_ == _) })
  }
}
