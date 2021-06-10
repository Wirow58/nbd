package zestaw1

object z7 {
  def main(args: Array[String]): Unit = {
    val items = Map("Bulbulator" -> 2.40, "Książka: Jak zrazić do siebie ludzi" -> 19.90, "Majonez Białuty(the one and only)" -> 5.00, "Rada szamana" -> 3.00)

    println(getByKey[String, Double](items, "Bulbulator"))
  }

  def getByKey[K, V](map: Map[K, V], key: K): Any = {
    map.getOrElse(key, "Nie mamy takiego produktu na stanie")
  }
}
