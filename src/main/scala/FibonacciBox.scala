/**
 * Created by stpyang on 4/28/14.
 */
object FibonacciBox {
  def apply(a: Long, b: Long, c: Long, d: Long) = new FibonacciBox(a, b, c, d)
  val SEED = FibonacciBox(1, 1, 2, 3)
}

class FibonacciBox(val a: Long, val b: Long, val c: Long, val d: Long) {
  def getChildren = Array[FibonacciBox](
    FibonacciBox(d - b, b, d, 2 * d - b),
    FibonacciBox(b, d, b + d, 2 * b + d),
    FibonacciBox(d, b, b + d, b + 2 * d)
  )
  def getPythagoreanTriple = Array(b * d, 2 * a * c, c * d - a * b)
  def getSumOfSides = getPythagoreanTriple.sum

  override def toString = "FibonacciBox(" + b * d + ", " + 2 * a * c + ", " + (c * d + a * b) + ")"
}      
