package zestaw1

object z6 {
  def main(args: Array[String]): Unit = {
    val tuple = ("abcd1234", false, 12345)
    printTuple(tuple)
  }

  def printTuple(tuple: (String, Boolean, Int)): Unit = {
    println(tuple._1 + ", " + tuple._2 + ", " + tuple._3)
  }
}
