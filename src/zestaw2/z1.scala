package zestaw2
object z1 {
  def main(args: Array[String]) : Unit = {
    println(doCheck("Poniedziałek"))
    println(doCheck("Wtorek"))
    println(doCheck("Środa"))
    println(doCheck("Czwartek"))
    println(doCheck("Piątek"))
    println(doCheck("Sobota"))
    println(doCheck("Niedziela"))
    println(doCheck("hurr scala durr"))
  }

  def doCheck(str: String) : String = {
    val workDays = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek")
    val weekend = List("Sobota", "Niedziela")
    str match {
      case x: String if workDays.contains(x) => "Praca"
      case x: String if weekend.contains(x) => "Weekend"
      case _ => "Hehe, bardzo śmieszne"
    }
  }
}