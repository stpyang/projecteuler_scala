import scala.annotation.tailrec

/**
 * Created by stpyang on 4/27/14.
 */

object Problem002 {
  def apply(n: Int) = new Problem002(n)

  def main(args: Array[String]) = println(Problem002(4000000).solve)
}

// even fibonacci numbers are generated by the sequence
// e_0 = 2, e_1 = 8, e_{n + 1} = 4 * e_n + e_{n - 1}
class Problem002(n: Int) {
  @tailrec private def _solve(n: Int, a: Int, b: Int, accum: Int): Int = {
    if (b > n) accum + a
    else _solve(n, b, 4 * b + a, accum + a)
  }

  def solve = _solve(n, 0, 2, 0)
}
