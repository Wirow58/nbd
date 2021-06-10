package zestaw1

object z8 {
  def main(args: Array[String]): Unit = {
    val intList = List(0, 3, 33, 333, 0, 123, 0, 12345, 0, 999, 0)
    println(removeZeroes(intList))
  }

  def removeZeroes(intList: List[Int]): List[Int] = {
    def doRemove(index: Int, currentList: List[Int]): List[Int] = {
      if (index >= currentList.length) return currentList

      val (part1, part2) = currentList.splitAt(index)

      if (currentList.get(index) == 0)
        doRemove(index + 1, part1 ++ part2.tail)
      else
        doRemove(index + 1, currentList)
    }

    doRemove(0, intList)
  }
}
