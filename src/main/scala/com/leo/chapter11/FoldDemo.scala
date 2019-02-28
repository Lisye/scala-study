package com.leo.chapter11

object FoldDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    val list2 = list.foldLeft(5)(minus)
    println(list2)

    val list4 = List(1,9)
    var i6 = (1 /:list4)(minus)
    println(i6)

    i6 = (list4 :\ 100)(minus)
    println(i6)

  }
  def minus(n1: Int, n2: Int): Int = {
    n1 - n2
  }
}
