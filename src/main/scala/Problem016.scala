/**
 * Created by stpyang on 4/29/14.
 */
object Problem016 {
  def apply(n: Int) = new Problem016(n)

  def main(args: Array[String]) = println(Problem016(1000).solve)
}

class Problem016(n: Int) {
  def solve = BigInt(2).pow(n).toString().map(_.toString.toInt).sum
}
