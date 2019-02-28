package com.leo.chapter11

object StreamDemo {
  def main(args: Array[String]): Unit = {
    val stream1 = numsForm(1)
    println(stream1)
    println(stream1.head)
    println(stream1.tail)
    println(stream1)
  }

  def numsForm(n: BigInt): Stream[BigInt] = n #:: numsForm(n+1)
}
