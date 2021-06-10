package zestaw2
object z2 {
  def main(args: Array[String]) : Unit = {
    val biedaKonto = new KontoBankowe()
    println(biedaKonto.stanKonta)
    val syteKonto = new KontoBankowe(100)
    println(syteKonto.stanKonta)
    syteKonto.wyplata(50)
    println(syteKonto.stanKonta)
    syteKonto.wplata(500)
    println(syteKonto.stanKonta)
  }

  class KontoBankowe(private var _stanKonta: Double) {
    def this() {
      this(0)
    }
    def stanKonta : Double = _stanKonta

    def wplata(ammount: Double) : Unit = {
      this._stanKonta = this._stanKonta + ammount
    }

    def wyplata(ammount: Double) : Unit = {
      this._stanKonta = this._stanKonta - ammount
    }
  }
}