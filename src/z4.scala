object z4 {
  def main(args: Array[String]) : Unit = {
    val daysOfWeek = List(
      "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(getDaysByFoldLeft(daysOfWeek))
    println(getDaysByFoldRight(daysOfWeek))
    println(foldLeftWithP(daysOfWeek))
  }

  def getDaysByFoldLeft(list: List[String]) : String = {
    list.tail.foldLeft(list.head)(_ + "," + _)
  }

  def getDaysByFoldRight(list: List[String]) : String = {
    list.dropRight(1).foldRight(list.last)(_ + "," + _)
  }

  def foldLeftWithP(list: List[String]) : String = {
    list.filter(_.toUpperCase().startsWith("P")).tail.foldLeft(list.head)(_ + "," + _)
  }
}