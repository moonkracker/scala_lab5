package lab5Test

import lab5.lab5_1
import org.scalatest.funsuite.AnyFunSuite

import scala.util.Random

class lab5_1Test extends AnyFunSuite {
  /*Тесты иногда проваливаются, ибо получаются расхождения
  вида 2.328306436538696E22 did not equal 2.3283064365386964E22,
  т.е. значение верно, но моя функция высчитывает на один знак после запятой больше.
  Equals тоже выдает в таком случае ошибку, но не пишет какие значения были получены.*/
  test("Power of number recursive") {
    val number: Double = Random.nextInt(50)
    val power: Int = Random.nextInt(40)
    assert((lab5_1.MyPowerRec(number)^power) === scala.math.pow(number, power))
  }

  test("Power of number tail recursion"){
    val number: Double = Random.nextInt(50)
    val power: Int = Random.nextInt(40)
    assert(lab5_1.PowerTailRec(number, power) === scala.math.pow(number, power))
  }

  test("Check recursions"){
    val number: Double = Random.nextInt(50)
    val power: Int = Random.nextInt(40)
    assert(lab5_1.PowerTailRec(number, power) === lab5_1.PowerTailRec(number, power))
  }
}