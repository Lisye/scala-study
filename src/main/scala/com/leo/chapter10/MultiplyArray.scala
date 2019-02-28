package com.leo.chapter10

object MultiplyArray {
  def main(args: Array[String]): Unit = {
    val arr = Array.ofDim[Int](3, 4)

    for (item <- arr) {
      for (item2 <- item) {
        print(item2)
      }
      println()
    }

    println(arr(1)(1))
    arr(1)(1) = 100

    for(i<- 0 until arr.length) {
      for (j <- 0 until arr(i).length) {
        print(arr(i)(j) + "\t")
      }
      println()
    }
  }
}
