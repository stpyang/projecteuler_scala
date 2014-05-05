import scala.annotation.tailrec

/**
 * Created by stpyang on 4/28/14.
 */
object PrimeSieve {
  def apply(upperLimit: Int) = new PrimeSieve(upperLimit)
}
class PrimeSieve(val upperLimit: Int) {
  // just keep track of odd integers to save space
  private val primeSieve = (for (i <- 1 to upperLimit if i % 2 == 1) yield if (i == 1) false else true).toArray

  // initialize the primeSieve using a sieve
  for (i <- 3 to math.sqrt(upperLimit).toInt if isPrime(i)) {
    var j = 3 * i
    while ((j - 1) / 2 < primeSieve.length) {
      primeSieve((j - 1) / 2) = false
      j += 2 * i
    }
  }

  def isPrime(n: Int) = {
    if (n <= 1) false
    else if (n > upperLimit) throw new IllegalArgumentException("prive sieve too small!")
    else if (n == 2) true
    else if (n % 2 == 0) false
    else primeSieve((n - 1) / 2)
  }

  @tailrec private def _getNextPrime(p: Int): Int = {
    if (isPrime(p)) p
    else _getNextPrime(p + 1)
  }

  def getNextPrime(p: Int): Int = {
    return _getNextPrime(p + 1)
  }
}
