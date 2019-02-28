package com.leo.chapter07.myextends

object ScalaBaseConstrator {
  def main(args: Array[String]): Unit = {
    val emp = new Emp700()
    println("==============")
    val emp2 = new Emp700("mary")
  }
}

class Person700(pName: String) {
  var name = pName
  println("Person")

  def this() {
    this("default name")
    println("default name")
  }
}

class Emp700() extends Person700() {
  println("Emp...")

  def this(name: String) {
    this
    this.name = name
    println("Emp 辅助构造器~")
  }
}

//class Emp700(eName: String, eAge: Int) extends Person700(eName) {
//  println("Emp ....") //辅助构造器
//  def this(name: String) {
//    this(name, 100) // 必须调用主构造器 this.name = name
//    println("Emp 辅助构造器~")
//  }
//
//  def showInfo(): Unit = {
//    println("雇员的名字 ", name)
//  }
//}
