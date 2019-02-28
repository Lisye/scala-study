package com.leo.chapter11

object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4)
    val list2 = list1.reduceLeft(sum)
    println(list2)
  }

  def sum(n1: Int, n2: Int): Int={
    n1 + n2
  }
}
