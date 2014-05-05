/**
 * Created by stpyang on 4/28/14.
 */
object Problem010 {
  def apply(n: Int) = new Problem010(n)

  def main(args: Array[String]) = println(Problem010(2000000).solve)
}

class Problem010(n: Int) {
  def solve = {
    val primeSieve = PrimeSieve(n)
    (1 to n).filter(primeSieve.isPrime).map(_.toLong).sum
  }
}
