package com.leo.chapter05.myexception

object ScalaExceptionDemo1 {
  def main(args: Array[String]): Unit = {
    try {
      f1()
      var r = 10 / 0
    } catch {
      case e: NumberFormatException => {
        println("NumberFormatException")
      }
      case e: ArithmeticException => {
        println("ArithmeticException")
      }
      case e: Exception => println("Exception")
    } finally {
      println("scala finally...")
    }

    println("ok,.....")
  }

  @throws(classOf[NumberFormatException])
  def f1() = {
    "abc".toInt
  }
}
