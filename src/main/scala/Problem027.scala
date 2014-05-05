import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer

/**
 * Created by stpyang on 5/1/14.
 */
object Problem027 {
  def apply(n: Int) = new Problem027(n)

  def main(args: Array[String]) = println(Problem027(1000).solve)
}

class Problem027(n: Int) {
  def solve = {
    val primeSieve = new PrimeSieve(2 * n)

    // first we form a list of candidate pairs (a, b)
    val candidates = ArrayBuffer[(Int, Int)]()
    (2 until n).filter(primeSieve.isPrime).foreach(b => {
      for (a <- -n + 1 until n) if (primeSieve.isPrime(1 + a + b)) { candidates += Tuple2(a, b) }
    })

    // then for each consecutive value of n we remove candidates which
    // are not prime for b + n * (a + n)

    @tailrec def getLastCandidate(candidates: ArrayBuffer[(Int, Int)], i: Int): (Int, Int) = {
      if (candidates.size == 1) candidates(0)
      else getLastCandidate(candidates.filter(x => BigInt(x._2 + i * (x._1 + i)).isProbablePrime(5)), i + 1)
    }

    val result = getLastCandidate(candidates, 1)

    result._1 * result._2
  }
}
