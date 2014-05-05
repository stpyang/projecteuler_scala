/**
 * Created by stpyang on 4/29/14.
 */
object Problem019 {
  def apply(firstYear: Int, lastYear: Int) = new Problem019(firstYear, lastYear)

  def main(args: Array[String]) = println(Problem019(1901, 2001).solve)

  // this is copied from wikipedia
  private val TONDERING = Array(0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4)

}

class Problem019(firstYear: Int, lastYear: Int) {
  private def dayOfWeek(year: Int, month: Int, day: Int): Int = {
    val y = if (month < 3) year - 1 else year
    (y + y / 4 - y / 100 + y / 400 + Problem019.TONDERING(month - 1) + day) % 7
  }

  def solve = {
    val firstDays = for(year <- firstYear until lastYear; month <- 1 to 12) yield dayOfWeek(year, month, 1)
    firstDays.count(_ == 0)
  }
}
