package zestaw1

object z2 {
  def main(args: Array[String]): Unit = {
    val daysOfWeek = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(getWeekdaysString(daysOfWeek))
    println(getReverseWeekdaysList(daysOfWeek))
  }

  def getWeekdaysString(list: List[String]): String = {
    if (list.tail.nonEmpty)
      list.head + "," + getWeekdaysString(list.tail)
    else
      list.head
  }

  def getReverseWeekdaysList(list: List[String]): String = {
    if (list.tail.nonEmpty)
      getReverseWeekdaysList(list.tail) + "," + list.head
    else
      list.head
  }
}
