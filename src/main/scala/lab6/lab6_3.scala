package lab6

object lab6_3 {           //На основе List[String] сгенерировать строку, сконкатенированную через ' ' из тех подстрок List, которые начинаются с заглавной буквы.
  def isAlphabetic(s: String): Boolean = s == s.toSeq.sorted.unwrap

  def concatination(list: List[String]): String ={
    val tmp = list.filter(s => s.charAt(0).isUpper )
    tmp.reduceLeft(_+" "+_)
  }

  def main(args: Array[String]): Unit = {

  }
}
