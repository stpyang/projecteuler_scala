import scala.annotation.tailrec

/**
 * Created by stpyang on 4/28/14.
 */
object Problem014 {
  def apply(n: Int) = new Problem014(n)

  def main(args: Array[String]) = println(Problem014(1000000).solve)
}

class Problem014(n: Int) {

  // memoized
  var chainLengthMap = Map[Long, Int]()
  def chainLength(n: Long): Int =  chainLengthMap.getOrElse(n, {
    if (n == 0) 0
    else if (n == 1) 1
    else if (n % 2 == 0) 1 + chainLength(n / 2)
    else 1 + chainLength(3 * n + 1)
  })

  def solve = EulerUtil.maxIndex((0 until n).map(chainLength(_)).toList)
}
