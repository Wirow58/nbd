package zestaw2
object z5 {

  def main(args: Array[String]): Unit = {
    val pracownik = new Osoba("Jan", "Kowalski", 10) with Pracownik
    pracownik.pensja = 10000
    println("Pensja pracownika: " + pracownik.pensja)
    println("Podatek od pensji pracownika: " + pracownik.podatek)

    val student = new Osoba("Kurt", "Russel", 10) with Student
    println("Podatek studenta: " + student.podatek)

    val nauczyciel = new Osoba("Eugene", "Stoner", 10) with Nauczyciel
    nauczyciel.pensja = 3000
    println("Pensja nauczyciela: " + nauczyciel.pensja)
    println("Podatek od pensji nauczyciela: " + nauczyciel.podatek)

    val studentPracownik = new Osoba("David", "Tinfield", 10) with Student with Pracownik
    studentPracownik.pensja = 2000
    println("Pensja studenta-pracownika: " + studentPracownik.pensja)
    println("Podatek od pensji studenta-pracownika: " + studentPracownik.podatek)

    val pracownikStudent = new Osoba("Karl", "Franz", 10) with Pracownik with Student
    pracownikStudent.pensja = 2000
    println("Pensja pracownika-studenta: " + pracownikStudent.pensja)
    println("Podatek od pensji pracownika-studenta: " + pracownikStudent.podatek)
    println("Wniosek: Trait dodany jako ostatni przysłania poprzednie")
  }

  class Osoba(val imie: String, val nazwisko: String, private var _podatek: Double) {
    def podatek: Double = _podatek
  }

  trait Pracownik extends Osoba {
    var pensja: Double = 3000
    override def podatek: Double = 0.2 * pensja
  }

  trait Student extends Osoba {
    override def podatek: Double = 0
  }

  trait Nauczyciel extends Pracownik {
    override def podatek: Double = 0.1 * pensja
  }
}