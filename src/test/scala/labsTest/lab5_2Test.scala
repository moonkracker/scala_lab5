package labsTest

import lab5.lab5_2
import org.scalatest.funsuite.AnyFunSuite

class lab5_2Test extends AnyFunSuite{
  test("Check square of numbers in range [lower; higher] (Recursion)") {
    val lower: Int = -5
    val higher: Int = 36
    val list = lab5_2.squareCheck(lower, higher)
    assert(list.equals(List(0,1,2,3,4,5,6)))
  }

  test("Check square of numbers in range [lower; higher] (Tail recursion)") {
    val lower: Int = -5
    val higher: Int = 36
    val list = lab5_2.squareCheckTailRec(lower, higher)
    assert(list.reverse.equals(List(0,1,2,3,4,5,6)))
  }

  test("Check square of numbers in range [lower; higher] (Tail recursion and recursion)") {
    val lower: Int = -5
    val higher: Int = 36
    val list = lab5_2.squareCheck(lower, higher)
    val list2 = lab5_2.squareCheckTailRec(lower, higher)
    assert(list2.reverse.equals(list))
  }
}
