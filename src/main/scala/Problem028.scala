/**
 * Created by stpyang on 5/1/14.
 */
object Problem028 {
  def apply(n: Int) = new Problem028(n)

  def main(args: Array[String]) = println(Problem028(1001).solve)
}

class Problem028(n: Int) {
  // the four corners on the i-th level have coordinates
  // (4 * i * i + 4 * i + 1);
  // (4 * i * i + 2 * i + 1);
  // (4 * i * i + 1);
  // (4 * i * i - 2 * i + 1);
  // respectively
  def solve = 1 + (1 until (n + 1) / 2).map(i => { (16 * i + 4) * i + 4 }).sum
}
