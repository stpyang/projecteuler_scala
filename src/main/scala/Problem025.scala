import math.ceil
import math.log10
import math.round
import math.sqrt

/**
 * Created by stpyang on 4/30/14.
 */
object Problem025 {
  def apply(n: Int) = new Problem025(n)

  def main(args: Array[String]) = println(Problem025(1000).solve)
}

class Problem025(n: Int) {
  val phi = (1 + sqrt(5)) / 2
  // this approximation only works for *large* values of n
  def solve = round(ceil((n - 1 + log10(sqrt(5))) / log10(phi)))
}
