package lab5
import scala.annotation.tailrec
import scala.math._

object lab5_2 {
  def squareCheck(low: Int, high: Int, counter: Int = 0) : List[Int] = {
    if (low > high) Nil
    else if(counter > high) Nil
    else if (pow(counter, 2) <= high  && pow(counter, 2) >= low)
      counter :: squareCheck(low, high, counter+1)
    else
      squareCheck(low, high, counter +1)
  }

  @tailrec
  def squareCheckTailRec(low: Int, high: Int, counter: Int = 0, answer: List[Int] = List()) : List[Int] = {
    if (low > high) Nil
    else if(counter > high) answer
    else if (pow(counter, 2) <= high  && pow(counter, 2) >= low)
      squareCheckTailRec(low, high, counter+1, counter :: answer)
    else
      squareCheckTailRec(low, high, counter+1, answer)
  }
}
