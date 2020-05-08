package lab6

object lab6_3 {           //На основе List[String] сгенерировать строку, сконкатенированную через ' ' из тех подстрок List, которые начинаются с заглавной буквы.
  def concatination(list: List[String]): String ={
    list.filter(s => s.charAt(0).isUpper ).reduceLeft(_+" "+_)
  }
}
