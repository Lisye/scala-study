package com.leo.chapter03.myfor

object MultiFor {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 1 to 3) {
      println("i = " + i + "\tj = " + j)
    }
  }
}
