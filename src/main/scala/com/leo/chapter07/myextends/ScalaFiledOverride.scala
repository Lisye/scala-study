package com.leo.chapter07.myextends

object ScalaFiledOverride {
  def main(args: Array[String]): Unit = {
    val obj1: AAA = new BBB
    val obj2: BBB = new BBB

    println(obj1.age)
    println(obj2.age)
  }
}

class AAA {
  val age: Int = 10
}

class BBB extends AAA {
  override val age: Int = 20
}