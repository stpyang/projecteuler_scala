/**
 * Created by stpyang on 4/29/14.
 */
object Problem020 {
  def apply(n: Int) = new Problem020(n)

  def main(args: Array[String]) = println(Problem020(100).solve)
}

class Problem020(n: Int) {
  def factorial(n: BigInt): BigInt = {
    if (n == 0) BigInt(1)
    else n * factorial(n - 1)
  }

  def solve = factorial(BigInt(n)).toString().map(_.toString.toInt).sum
}
