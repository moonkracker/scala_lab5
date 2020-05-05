package lab6Test
import org.scalatest.funsuite.AnyFunSuite
class lab6_1Test extends AnyFunSuite {
  test("Returns set with common elements from both input sets"){
    val s1 = Set[Int](1,2,3,4)
    val s2 = Set[Int](3,4,5,6)
    val result = lab6.lab6_1.intersectWithSets(s1, s2)
    assert(result === Set[Int](3,4))
  }

  test("Returns list with common elements from both input lists"){
    val l1 = List[Int](1,2,3,4)
    val l2 = List[Int](3,4,5,6, 1, 1)
    val result = lab6.lab6_1.intersectWithLists(l1, l2)
    assert(result === List[Int](1,3,4))
  }
}
