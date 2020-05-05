package lab6Test
import org.scalatest.funsuite.AnyFunSuite
class lab6_2Test extends AnyFunSuite {
  test("Computes the average value between all numbers in list"){
    val l1 = List[Double](1,2,3,4,5)
    assert(lab6.lab6_2.average(l1) === 3)

    val l2 = List[Double](1,2,3,4,5,6)
    assert(lab6.lab6_2.average(l2) === 3.5)

    val l3 = List[Double](10,10,3,11,5,6,7,8)
    assert(lab6.lab6_2.average(l3) === 7.5)
  }
}
