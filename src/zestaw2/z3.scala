package zestaw2
object z3 {
  def main(args: Array[String]) : Unit = {
    println(greeting(Osoba("Dacjan", "Klakier")))
    println(greeting(Osoba("Immanuel", "Kant")))
    println(greeting(Osoba("Gromosław", "Bąk")))
    println(greeting(Osoba("Immanuel", "nieKant")))
  }

  case class Osoba(val imie: String, val nazwisko: String) {}

  def greeting(osoba: Osoba) = osoba match {
    case Osoba("Dacjan", _) => "Elo Dacjan"
    case Osoba("Immanuel", "Kant") => "Uszanowanko profesorze Kant"
    case Osoba(imie, _) => s"Witaj $imie, jesteś defaultem"
  }
}