import scala.annotation.tailrec

/**
 * Created by stpyang on 4/27/14.
 */
object Problem003 {
  def apply(n: Long) = new Problem003(n)

  def main(args: Array[String]) = println(Problem003(600851475143L).solve)
}

// just keep on dividing by small numbers until we run out
class Problem003(n: Long) {

  @tailrec private def _solve(n: BigInt, q: BigInt): BigInt = {
    if (n == q) q
    else if (n % q == 0) _solve(n / q, q)
    else if (q == 2) _solve(n, 3)
    else _solve(n, q + 2)
  }

  def solve = {
    _solve(BigInt(n), BigInt(2)).toLong
  }
}
