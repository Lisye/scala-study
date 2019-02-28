package com.leo.chapter07.myextends

object ScalaFieldOverrideDetail03 {
  def main(args: Array[String]): Unit = {
    println("hi")
  }
}

abstract class A03 {
  var name: String
  var age: Int = 10
}

class Sub_A03 extends A03 {
  override var name: String = ""
}