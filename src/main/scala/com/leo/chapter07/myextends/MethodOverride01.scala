package com.leo.chapter07.myextends

object MethodOverride01 {
  def main(args: Array[String]): Unit = {
    val emp = new Emp100
    emp.printName()
  }
}

class Person100 {
  var name: String = "tom"

  def printName(): Unit = {
    println("Person printName()" + this.name)
  }

  def sayHi(): Unit = {
    println("sayHi...")
  }
}

class Emp100 extends Person100 {
  override def printName(): Unit = {
    println("Emp printName()" + name)

    super.printName()
    sayHi()
  }
}
