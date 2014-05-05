/**
 * Created by stpyang on 4/27/14.
 */

object Problem001 {
  def apply(a: Int, b: Int, n: Int) = new Problem001(a, b, n)

  def main(args: Array[String]) = println(Problem001(3, 5, 1000).solve)
}

class Problem001(a: Int, b: Int, n: Int) {
  def solve = (1 until n).filter(x => x % a == 0 || x % b == 0).sum
}
