object z10 {
  def main(args: Array[String]) : Unit = {
    val reals = List(1.23, -2.34, -5.67, 11.0, -24.0, 0.0, 122.0, -12.3, -22.123, 3.0, 5.12)
    println(getAbsolute(reals))
  }

  def getAbsolute(list: List[Double]) : List[Double] = {
    val filterPredicate : Double => Boolean = v => v >= -5.0 && v <= 12.0
    list.filter(filterPredicate).map(_.abs)
  }
}