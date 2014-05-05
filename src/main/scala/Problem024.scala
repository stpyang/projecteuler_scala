import scala.collection.mutable.ArrayBuffer

/**
 * Created by stpyang on 4/30/14.
 */
object Problem024 {
  def apply(n: Int, k: Int) = new Problem024(n, k)

  def main(args: Array[String]) = println(Problem024(1000000, 10).solve)
}

class Problem024(n: Int, k: Int) {

  def solve = {
    val digits = ArrayBuffer[Int]()
    (0 until k).foreach(digits += _)

    def getDigits(n: Int, digits: ArrayBuffer[Int]): String = {
      if (digits.isEmpty) ""
      else {
        val f = EulerUtil.factorial(digits.length - 1).toInt
        val i = n / f
        digits.remove(i).toString + getDigits(n - i * f, digits)
      }
    }

    getDigits(n - 1, digits).toLong
  }
}

