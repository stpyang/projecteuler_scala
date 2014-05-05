/**
 * Created by stpyang on 4/28/14.
 */
object Problem006 {
  def apply(n: Int) = new Problem006(n)

  def main(args: Array[String]) = println(Problem006(100).solve)
}

class Problem006(n: Int) {
  def solve = {
    def square(x: Int) = x * x
    square((1 to n).sum) - (1 to n).map(square).sum
  }
}
