package zestaw1

object z1 {
  def main(args: Array[String]): Unit = {
    val daysOfWeek = List(
      "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")

    println(useForLoop(daysOfWeek))
    println(getPDays(daysOfWeek))
    println(useWhileLoop(daysOfWeek))
  }

  def useForLoop(list: List[String]): String = {
    var result = ""
    var i = 0

    for (elem <- list) {
      if (i == 0)
        result = elem
      else
        result = result + "," + elem

      i = i + 1
    }

    result
  }

  def getPDays(list: List[String]): String = {
    var result = ""
    var i = 0

    for (elem <- list.filter(_.toUpperCase().startsWith("P"))) {
      if (i == 0)
        result = elem
      else
        result = result + "," + elem

      i = i + 1
    }

    result
  }

  def useWhileLoop(list: List[String]): String = {
    val listLength = list.length;
    var i = 0;
    var result = ""

    while (i < listLength) {
      if (i == 0)
        result = list(i)
      else
        result = result + "," + list(i)
      i = i + 1
    }

    result
  }
}
