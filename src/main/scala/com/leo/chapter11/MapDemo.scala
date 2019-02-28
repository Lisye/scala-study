package com.leo.chapter11

object MapDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 4)
    val mulList = list.map(multiple)
    println(mulList)
  }

  def multiple(n1: Int): Int = {
    n1 * 2
  }
}
