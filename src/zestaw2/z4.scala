package zestaw2

import scala.annotation.tailrec

object z4 {
  def main(args: Array[String]) : Unit = {
    println(transformValue(2, n => n*2))
  }

  def transformValue(value: Int, fun: Int => Int) : Int = {
    val i = 0

    @tailrec
    def iterator(v: Int, i: Int) : Int = {
      if(i < 3)
        iterator(fun(v), i + 1)
      else
        v
    }
    iterator(value, i)
  }
}