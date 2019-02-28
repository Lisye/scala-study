package com.leo.chapter09

object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {

    implicit def f1(d: Double): Int = {
      d.toInt
    }

    implicit def f2(f: Float): Int = {
      f.toInt
    }

//    implicit def f3(f:Float): Int = {
//      f.toInt
//    }

    val num: Int = 3.5
    val num2: Int = 4.5f
  }
}
