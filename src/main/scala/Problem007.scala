import scala.annotation.tailrec

/**
 * Created by stpyang on 4/28/14.
 */
object Problem007 {
  def apply(n: Int) = new Problem007(n)

  def main(args: Array[String]) = println(Problem007(10001).solve)
}

class Problem007(n: Int) {
  def solve = {
    // by the prime number theorem, we can estimate an upper bound for the n-th prime number
    @tailrec def getEstimate(estimate: Int): Int = {
      if (estimate / math.log(estimate) > 2 * n) estimate
      else getEstimate(2 * estimate)
    }

    val estimate = getEstimate(10)

    val primeSieve = new PrimeSieve(estimate)
    @tailrec def getNthPrimeNumber(n: Int, p: Int): Int = {
      if (n == 0) p
      else getNthPrimeNumber(n - 1, primeSieve.getNextPrime(p))
    }

    getNthPrimeNumber(n, 1)
  }
}
