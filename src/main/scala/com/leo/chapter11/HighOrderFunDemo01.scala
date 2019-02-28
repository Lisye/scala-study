package com.leo.chapter11

object HighOrderFunDemo01 {
  def main(args: Array[String]): Unit = {
    val res = test(sum2, 1)
    println(res)
  }

  def test(f: Double=>Double, n1: Double)={
    f(n1)
  }

  def sum2(d: Double): Double = {
    d + d
  }
}
