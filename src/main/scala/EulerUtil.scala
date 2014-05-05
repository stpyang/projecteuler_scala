import scala.annotation.tailrec

/**
 * Created by stpyang on 4/27/14.
 */
object EulerUtil {

  def factorial(n: Long): Long = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }

  @tailrec def gcd(a: Int, b: Int): Int = {
    if (b == 0) a
    else gcd(b, a % b)
  }

  def getSumsOfDivisorsUpTo(n: Int) = {
    val result = new Array[Int](n + 1)
    (1 to n).foreach(i => {
      (2 * i to n by i).foreach(result(_) += i)
    })
    result
  }

  @tailrec private def isPalindrome(s: String): Boolean = {
    if (s.isEmpty || s.length == 1) true
    else if (s.head != s.last) false
    else isPalindrome(s.tail.dropRight(1))
  }

  def isPalindrome(n: Int): Boolean = isPalindrome(n.toString)

  def maxIndex[ T <% Ordered[T] ] (list : List[T]) : Int = list match {
    case Nil => -1
    case head::tail =>
      tail.foldLeft((0, head, 1)){
        case ((indexOfMaximum, maximum, index), elem) =>
          if(elem > maximum) (index, elem, index + 1)
          else (indexOfMaximum, maximum, index + 1)
      }._1
  }
}
