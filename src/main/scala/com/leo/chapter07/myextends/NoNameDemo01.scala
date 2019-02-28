package com.leo.chapter07.myextends

object NoNameDemo01 {
  def main(args: Array[String]): Unit = {
    val monster = new A2 {
      override var name: String = "xiaoxiao"

      override def cry(): Unit = {
        println("cry")
      }
    }

    println(monster.name)
    monster.cry()
  }
}

abstract class A2{
  var name: String
  def cry()
}
