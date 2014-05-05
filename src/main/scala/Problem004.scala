import EulerUtil.isPalindrome
/**
 * Created by stpyang on 4/27/14.
 */
object Problem004 {
  def apply(n: Int) = new Problem004(n)

  def main(args: Array[String]) = println(Problem004(3).solve)
}

class Problem004(n: Int) {

  private val maxN = ("9" * n).toInt
  private val minN = (1 until n).foldLeft(1)((x, y) => 10 * x)

  def solve = {
    (for (x <- minN to maxN; y <- minN to x if isPalindrome(x * y)) yield x * y).max
  }
}
