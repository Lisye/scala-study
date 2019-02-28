package com.leo.chapter03.myfor

object yieldFor {
  def main(args: Array[String]): Unit = {
    val res = for (i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      } else {
        "not"
      }
    }
    println(res)

    for {i <- 1 to 3
         j = i * 2} {
      println("i = " + i + " j = " + j)
    }
  }
}
