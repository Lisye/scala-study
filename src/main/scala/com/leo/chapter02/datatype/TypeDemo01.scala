package com.leo.chapter02.datatype

object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    println(num1.toDouble + "\t" + num1.toString + "\t" + 100.toDouble)

    var isPass = true
    println(isPass.toString)

    sayHi()

  }

  def sayHi(): Unit = {
    println("say hi")
  }
}
