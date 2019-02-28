package com.leo.chapter05.fundetails

object Details03 {
//  Scala语法中任何的语法结构都可以嵌套其他语法结构(灵活)，即:函数中可以再声明/定义函数， 类中可以再声明类 ，方法中可以再声明/定义方法
  def main(args: Array[String]): Unit = {
    def f1(): Unit = {
      println("f1")
    }

    println("ok")

    def sayOk(): Unit = {
      println("main sayOK")

      def sayOK(): Unit = {
        println("sayok sayok")
      }
    }
  }

  def sayOk(): Unit = {
    println("main sayOk")
  }
}
