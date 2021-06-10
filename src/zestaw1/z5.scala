package zestaw1

object z5 {
  def main(args: Array[String]): Unit = {
    val items = Map("Bulbulator" -> 2.40, "Książka: Jak zrazić do siebie ludzi" -> 19.90, "Majonez Białuty(the one and only)" -> 5.00, "Rada szamana" -> 3.00)

    val discountMap = getDiscountMap(items)
    println(discountMap)
  }

  def getDiscountMap(itemsPrices: Map[String, Double]): Map[String, Double] = {
    itemsPrices.map(kv => (kv._1, 0.9 * kv._2))
  }
}
