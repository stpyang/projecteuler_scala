/**
 * Created by stpyang on 4/30/14.
 */
object Problem026 {
  def apply(n: Int) = new Problem026(n)

  def main(args: Array[String]) = println(Problem026(1000).solve)

  def getSequenceLength(divisor: Int, dividend: Int, position: Int, remainders: Array[Int]): Int = {
    if (dividend == 0) 0
    else if (remainders(dividend) != 0) position - remainders(dividend)
    else {
      remainders(dividend) = position
      getSequenceLength(divisor, (dividend * 10) % divisor, position + 1, remainders)
    }
  }

  def getSequenceLength(n: Int): Int = {
    if (n == 0) 0
    else if (n % 2 == 0) getSequenceLength (n / 2)
    else if (n % 5 == 0) getSequenceLength(n / 5)
    else getSequenceLength(n, 1, 1, new Array[Int](n + 1))
  }
}

class Problem026(n: Int) {

  def solve = {
    EulerUtil.maxIndex((0 until n).map(Problem026.getSequenceLength).toList)
  }
}
