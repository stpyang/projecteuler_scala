/**
 * Created by stpyang on 4/30/14.
 */
object Problem023 {
  def apply() = new Problem023()

  def main(args: Array[String]) = println(Problem023().solve)

  val UPPER_LIMIT = 28123
}

class Problem023 {

  def solve = {
    val sumOfDivisors = EulerUtil.getSumsOfDivisorsUpTo(Problem023.UPPER_LIMIT)
    def isAbundant(n: Int) = sumOfDivisors(n) > n
    val abundantNumbers = (0 until sumOfDivisors.length).filter(isAbundant)

    val sumOfTwoAmicableNumbers = new Array[Int](1 + Problem023.UPPER_LIMIT)
    def findParners(i: Int): Unit = {
      for (j <- 0 to i) {
        if (abundantNumbers(i) + abundantNumbers(j) > Problem023.UPPER_LIMIT) return
        else sumOfTwoAmicableNumbers(abundantNumbers(i) + abundantNumbers(j)) = abundantNumbers(i) + abundantNumbers(j)
      }
    }

    (0 until abundantNumbers.size).foreach(findParners)

    Problem023.UPPER_LIMIT * (Problem023.UPPER_LIMIT + 1) / 2 - sumOfTwoAmicableNumbers.sum
  }
}
