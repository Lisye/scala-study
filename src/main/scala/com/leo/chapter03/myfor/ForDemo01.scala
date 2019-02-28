package com.leo.chapter03.myfor

object ForDemo01 {
  def main(args: Array[String]): Unit = {
    val start = 1
    val end = 10
    for (i <- start to end) {
      println("hello, !world")
    }

    var list = List("hello", 10, 30, "tom")
    for (item <- list) {
      println("item=" + item)
    }

    for (i <- 1 until 3) {
      print(i + "")
    }
  }
}
