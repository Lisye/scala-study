package com.leo.chapter11

object ScanDemo {
  def main(args: Array[String]): Unit = {
    val i8 = (1 to 5).scanLeft(5)(minus)
    println(i8)

  }

  def minus( num1 : Int, num2 : Int ) : Int = {
    num1 - num2 }
}
