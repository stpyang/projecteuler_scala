import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * Created by stpyang on 4/27/14.
 */

@RunWith(classOf[JUnitRunner])
class TestSolutions extends FunSuite {

  test("Problem001") {
    assert(Problem001(3, 5, 10).solve === 23)
    assert(Problem001(3, 5, 1000).solve === 233168)
  }

  test("Problem002") {
    assert(Problem002(100).solve === 44)
    assert(Problem002(4000000).solve === 4613732)
  }

  test("Problem003") {
    assert(Problem003(13195).solve === 29)
    assert(Problem003(600851475143L).solve === 6857)
  }

  test("Problem004") {
    assert(EulerUtil.isPalindrome(9009))
    assert(Problem004(2).solve === 9009)
    assert(Problem004(3).solve === 906609)
  }

  test("Problem005") {
    assert(Problem005(10).solve === 2520)
    assert(Problem005(20).solve === 232792560)
  }

  test("Problem006") {
    assert(Problem006(10).solve === 2640)
    assert(Problem006(100).solve === 25164150)
  }

  test("Problem007") {
    assert(Problem007(6).solve === 13)
    assert(Problem007(10001).solve === 104743)
  }

  test("Problem008") {
    assert(Problem008(5).solve === 40824)
  }

  test("Problem009") {
    assert(Problem009(1000).solve === 31875000)
  }

  test("Problem010") {
    assert(Problem010(10).solve === 17)
    assert(Problem010(2000000).solve === 142913828922L)
  }

  test("Problem011") {
    assert(Problem011(4).solve === 70600674)
  }

  test("Problem012") {
    assert(Problem012(5).solve === 28)
    assert(Problem012(500).solve === 76576500)
  }

  test("Problem013") {
    assert(Problem013().solve === 5537376230L)
  }

  test("Problem014") {
    assert(Problem014(1000000).solve === 837799)
  }

  test("Problem015") {
    assert(Problem015(2).solve === 6)
    assert(Problem015(20).solve === 137846528820L)
  }

  test("Problem016") {
    assert(Problem016(15).solve === 26)
    assert(Problem016(1000).solve === 1366)
  }

  test("Problem017") {
    assert(Problem017(1000).solve === 21124)
  }

  test("Problem018") {
    assert(Problem018(Problem018.SAMPLE).solve === 23)
    assert(Problem018(Problem018.INPUT).solve === 1074)
  }

  test("Problem019") {
    assert(Problem019(1901, 2001).solve === 171)
  }

  test("Problem020") {
    assert(Problem020(10).solve === 27)
    assert(Problem020(100).solve === 648)
  }

  test("Problem021") {
    assert(Problem021(10000).solve === 31626)
  }

  test("Problem022") {
    assert(Problem022("data/names.txt").solve === 871198282)
  }

  test("Problem023") {
    assert(Problem023().solve === 4179871)
  }

  test("Problem024") {
    assert(Problem024(1, 3).solve === 12)
    assert(Problem024(2, 3).solve === 21)
    assert(Problem024(3, 3).solve === 102)
    assert(Problem024(4, 3).solve === 120)
    assert(Problem024(5, 3).solve === 201)
    assert(Problem024(6, 3).solve === 210)
    assert(Problem024(1000000, 10).solve === 2783915460L)
  }

  test("Problem025") {
    assert(Problem025(1000).solve === 4782)
  }

  test("Problem026") {
    assert(Problem026.getSequenceLength(1) === 0)
    assert(Problem026.getSequenceLength(2) === 0)
    assert(Problem026.getSequenceLength(3) === 1)
    assert(Problem026.getSequenceLength(4) === 0)
    assert(Problem026.getSequenceLength(5) === 0)
    assert(Problem026.getSequenceLength(6) === 1)
    assert(Problem026.getSequenceLength(7) === 6)
    assert(Problem026.getSequenceLength(8) === 0)
    assert(Problem026.getSequenceLength(9) === 1)
    assert(Problem026.getSequenceLength(10) === 0)
    assert(Problem026(1000).solve === 983)
  }

  test("Problem027") {
    assert(Problem027(1000).solve === -59231)
  }

  test("Problem028") {
    assert(Problem028(5).solve === 101)
    assert(Problem028(1001).solve === 669171001)
  }

  test("Problem029") {
    assert(Problem029(5).solve === 15)
    assert(Problem029(100).solve === 9183)
  }

  test("Problem030") {
    assert(Problem030(4).solve === 19316)
    assert(Problem030(5).solve === 443839)
  }
}
