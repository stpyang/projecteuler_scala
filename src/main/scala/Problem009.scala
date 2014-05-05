import scala.collection.mutable.ArrayBuffer

/**
 * Created by stpyang on 4/28/14.
 */
object Problem009 {
  def apply(n: Int) = new Problem009(n)

  def main(args: Array[String]) = println(Problem009(1000).solve)
}

class Problem009(n: Int) {
  def solve: Long = {
    var fibonacciBoxes = ArrayBuffer(FibonacciBox.SEED)
    while (true) {
      var temp = new ArrayBuffer[FibonacciBox]
      fibonacciBoxes.foreach(f => {
        if (n % f.getSumOfSides == 0) {
          val k = n / f.getSumOfSides
          return f.getPythagoreanTriple.map(k * _).product
        }
        temp ++= f.getChildren
      })
      fibonacciBoxes = temp
    }
    0L
  }
}
