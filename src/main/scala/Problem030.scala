import scala.annotation.tailrec

/**
 * Created by stpyang on 5/1/14.
 */
object Problem030 {
  def apply(n: Int) = new Problem030(n)

  def main(args: Array[String]) = println(Problem030(5).solve)
}

class Problem030(n: Int) {

  def power(n: Int, exponent: Int): Int = {
    if (exponent == 0) 1
    else n * power(n, exponent - 1)
  }

  def powerSumOfDigits(n: Int, exponent: Int): Int = {
    if (n == 0) 0
    else power(n % 10, exponent) + powerSumOfDigits(n / 10, exponent)
  }

  def solve = {
    // find the maximal number of digits
    @tailrec def getMaxDigits(digits: Int): Int = {
      if ((digits * power(9, n)).toString.length < digits) digits
      else getMaxDigits(digits + 1)
    }

    val maxDigits = getMaxDigits(1)

    (2 until power(10, maxDigits)).filter(i => powerSumOfDigits(i, n) == i).sum
  }
}
