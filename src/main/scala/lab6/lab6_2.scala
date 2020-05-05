package lab6

object lab6_2 {                             // Найти среднее арифметическое для всех элементов коллекции.(С использованием Fold)
  def average(list: List[Double]): Double = list match {
    case head :: tail => tail.foldLeft((head, 1.0)) { (avg, cur) =>
      ((avg._1 * avg._2 + cur)/(avg._2 + 1.0), avg._2 + 1.0)
    }._1
    case Nil => Double.NaN
  }
}
