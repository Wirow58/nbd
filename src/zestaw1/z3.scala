package zestaw1

import scala.annotation.tailrec

object z3 {
  def main(args: Array[String]): Unit = {
    val daysOfWeek = List(
      "Poniedziałek",
      "Wtorek",
      "Środa",
      "Czwartek",
      "Piątek",
      "Sobota",
      "Niedziela")

    println(getWeekdaysString(daysOfWeek))
  }

  def getWeekdaysString(list: List[String]): String = {
    @tailrec
    def tailrecFun(list: List[String], result: String): String = {
      if (list.isEmpty)
        result
      else
        tailrecFun(list.tail, result + "," + list.head)
    }

    tailrecFun(list.tail, list.head)
  }
}
