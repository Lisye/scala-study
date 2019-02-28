package com.leo.chapter11

object FilterDemo {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
    val names2 = names.filter(starA)
    println(names2)
  }

  def starA(s: String): Boolean = {
    s.startsWith("A")
  }
}
