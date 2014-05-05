/**
 * Created by stpyang on 4/29/14.
 */
object Problem021 {
  def apply(n: Int) = new Problem021(n)

  def main(args: Array[String]) = println(Problem021(10000).solve)
}

class Problem021(n: Int) {
  def solve = {
    val ds = EulerUtil.getSumsOfDivisorsUpTo(n)

    def isAmicable(i: Int) = ds(i) <= n && i != ds(i) && i == ds(ds(i))

    (1 to n).filter(isAmicable).sum
  }
}
