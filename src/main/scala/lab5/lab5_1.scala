package lab5
import scala.annotation.tailrec

object lab5_1 {
  implicit class MyPowerRec(val number:Double) {                   //Обычная рекурсия (переопределяем ^)
    def ^(power: Int): Double = power match {
      case 0 => 1
      case 1 => number
      case _ => number * (number ^ (power - 1))
    }
  }

  @tailrec                                                         //Хвостовая рекурсия
  final def PowerTailRec(number: Double, power: Int, result: Double = 1.0): Double = power match {
    case 0 => result
    case _ => PowerTailRec(number, power-1, number * result)
  }
}
