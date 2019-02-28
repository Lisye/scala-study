package com.leo.chapter10

object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    //定义数组，第一种方法
    var arr01 = new Array[Int](4)
    println(arr01.length)

    for (i <- arr01) {
      println(i)
    }

    arr01(2) = 10
    for (i <- arr01) {
      println(i)
    }

    //第二种方法
    //1. 使用的是 object Array 的 apply
    //2. 直接初始化数组，这时因为你给了 整数和 "", 这个数组的泛型就 Any //3. 遍历方式一样
    var arr02 = Array(1, 2, "zz")
    arr02(1) = 1.1
    for (i <- arr02) {
      println(i)
    }

    //可以使用我们传统的方式遍历，使用下标的方式遍历
    for (i <- 0 until arr02.length) {
      println(arr02(i))
    }

    for (i <- arr02.indices) {
      println(arr02(i))
    }
  }
}
