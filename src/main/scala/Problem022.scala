import scala.io.Source
import scala.Function2

/**
 * Created by stpyang on 4/29/14.
 */
object Problem022 {
  def apply(fileName: String) = new Problem022(fileName)

  def main(args: Array[String]) = println(Problem022("data/names.txt").solve)

  def wordScore(name: String) = name.replace("\"", "").map(_.toInt - 'A' + 1).sum
}

class Problem022(fileName: String) {

  val names = Source.fromFile(fileName).mkString.split(",").sorted

  def solve = {
    val multiply = { (x: Int, y: Int) => x * y }.tupled
    (1 to names.length zip names.map(Problem022.wordScore)).map(multiply).sum
  }
}
