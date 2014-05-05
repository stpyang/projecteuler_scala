/**
 * Created by stpyang on 4/28/14.
 */
object Problem012 {
  def apply(n: Int) = new Problem012(n)

  def main(args: Array[String]) = println(Problem012(500).solve)
}

class Problem012(n: Int) {

  // memoized
  var numberOfDivisorsMap = Map[Int, Int]()
  def numberOfDivisors(n: Int) =  numberOfDivisorsMap.getOrElse(n, {
    val temp = (1 to n).count(n % _ == 0)
    numberOfDivisorsMap += (n -> temp)
    temp
  })

  def solve: Int = {
    var i = 2
    while (true) {
      val b = numberOfDivisors(i + 1)
      // i is even
      if (b * numberOfDivisors(i / 2) > n) return i * (i + 1) / 2
      i += 1

      // i is odd
      if (b * numberOfDivisors((i + 1) / 2) > n) return i * (i + 1) / 2
      i += 1
    }
    0
  }
}
