package com.leo.chapter07.myextends

object TypeConvertCase {
  def main(args: Array[String]): Unit = {
    val stu = new Student400
    val emp = new Emp400

    test(stu)
    test(emp)
  }

  def test(p: Person400): Unit = {
    if (p.isInstanceOf[Student400]) {
      p.asInstanceOf[Student400].printName()
    } else if (p.isInstanceOf[Emp400]) {
      p.asInstanceOf[Emp400].showInfo()
    } else {
      println("type cast error")
    }
  }
}

class Person400 {
  def printName(): Unit = {
    println("Person400 printName")
  }

  def sayOk(): Unit = {
    println("Person400 sayOk")
  }
}

class Student400 extends Person400 {
  val stuId = 100

  override def printName(): Unit = {
    println("Student400 printName")
  }

  def cry(): Unit = {
    println("学生的 id=" + this.stuId)
  }
}

class Emp400 extends Person400 {
  val empId = 800

  override def printName(): Unit = {
    println("Emp400 printName")
  }

  def showInfo(): Unit = {

    println("雇员的 id=" + this.empId)
  }
}