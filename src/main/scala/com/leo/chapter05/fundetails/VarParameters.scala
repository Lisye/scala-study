package com.leo.chapter05.fundetails

object VarParameters {
  def main(args: Array[String]): Unit = {
    println(sum(1, 2, 3, 4, 5))
  }

  def sum(n1: Int, args: Int*): Int = {
    println("args.length = " + args.length)

    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum
  }

  //可变参数需要放在最后
//  def sum2(args: Int *, n1: Int): Int = {
//    1
//  }
}
