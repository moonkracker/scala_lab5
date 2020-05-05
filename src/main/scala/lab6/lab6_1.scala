package lab6

object lab6_1 {                    // Из двух коллекций сделать одну, в которой будут только общие для двух коллекций элементы.
  def intersectWithSets[T](s1: Set[T], s2: Set[T]): Set[T] = {
    s1 & s2
  }

  def intersectWithLists[T](l1: List[T], l2: List[T]): List[T] = {
    l1.intersect(l2)
  }
}
