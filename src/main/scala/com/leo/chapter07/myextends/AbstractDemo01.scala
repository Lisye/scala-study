package com.leo.chapter07.myextends

object AbstractDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

abstract class Animal {
  var name: String
  var age: Int
  var color: String = "black"
  def cry()
}
