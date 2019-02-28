package com.leo.chapter07.myextends

object Extends02 {
  def main(args: Array[String]): Unit = {

  }
}

class Base100 {
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

class Sub extends Base100 {
  def sayOk(): Unit = {
    this.n1 = 20
    this.n2 = 40
//    this.n3

    this.test100()
    this.test200()
    this.test200()
  }
}
