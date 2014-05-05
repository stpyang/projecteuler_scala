/**
 * Created by stpyang on 4/28/14.
 */
object Problem005 {
  def apply(n: Int) = new Problem005(n)

  def main(args: Array[String]) = println(Problem005(10).solve)
}

class Problem005(n: Int) {
  def lcm(a: Int, b: Int) = a / EulerUtil.gcd(a, b) * b
  def solve = {
    def _solve(n: Int): Int = {
      if (n == 1) 1
      else lcm(n, _solve(n - 1))
    }
    _solve(n)
  }
}
