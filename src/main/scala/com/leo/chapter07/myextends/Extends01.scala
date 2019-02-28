package com.leo.chapter07.myextends

object Extends01 {
  def main(args: Array[String]): Unit = {

  }
}

class Person {
  var name: String = _
  var age: Int = _

  def showInfo(): Unit = {
    println("name = " + this.name)
    println("age = " + this.age)

  }
}

class Student extends Person {
  def studying(): Unit = {
    println("")
  }
}

class Base {
  var n1: Int = 1
  protected var n2: Int = 2
  private var n3: Int = 3

  def test100(): Unit = {
    println("base 100")
  }

  protected def test200(): Unit = {
    println("base 200")
  }

  private def test300(): Unit = {
    println("base 300")
  }
}

class sub extends Base100{
  def sayOk():Unit = {
    this.n1 = 20
    this.n2 = 20
//    this.n3

    test100()
    test200()
//    test300()
  }
}
