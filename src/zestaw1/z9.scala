package zestaw1

object z9 {
  def main(args: Array[String]): Unit = {
    val intList = List(0, 3, 33, 333, 0, 123, 0, 12345, 0, 999, 0)

    println(incrementAllBy(intList, 1))
  }

  def incrementAllBy(list: List[Int], step: Int): List[Int] = {
    list.map(_ + step)
  }
}
