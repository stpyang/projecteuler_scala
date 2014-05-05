import scala.annotation.tailrec

/**
 * Created by stpyang on 4/29/14.
 */
object Problem015 {
  def apply(n: Int) = new Problem015(n)

  def main(args: Array[String]) = println(Problem015(20).solve)
}

class Problem015(n: Int) {

  private def solution(n: Int): Long =
    if (n == 0) 1
    else (4 * n - 2).toLong * solution(n - 1) / n

  def solve = solution(n)
}
