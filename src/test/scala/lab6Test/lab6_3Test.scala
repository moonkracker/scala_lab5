package lab6Test

import lab6.lab6_3.concatination
import org.scalatest.funsuite.AnyFunSuite
class lab6_3Test extends AnyFunSuite {
  test("Concate string from values of List[String], that starts with Uppercase letter"){
    val list = List[String]("Hey!", "I am a", "lazy but", "Clever", "Guy!")
    assert(concatination(list) === "Hey! I am a Clever Guy!")
  }
}