package com.leo.chapter07.myextends

object TypeConvert {
  def main(args: Array[String]): Unit = {
//    println(classOf[String])
//
//    val s = "king"
//    println(s.getClass.getName)
//
//    var p1 = new Person200
//    var emp = new Emp200
//
//    p1 = emp
//    p1.printName()
//    emp.printName()
//
//    var emp2 = p1.asInstanceOf[Emp200]
//    emp2.sayHi()

//    var p2:Person200 = new Emp200
//    p2.printName()
//    println(p2.isInstanceOf[Person200])
//    println(p2.isInstanceOf[Emp200])
//    println("--------------------------")
//    val p3 = p2.asInstanceOf[Person200]
//    println(p3.isInstanceOf[Person200])
//    println(p3.isInstanceOf[Emp200])

    println("--------------------------")
    var p4 = new Person200
    println(p4.printName())
    p4.asInstanceOf[Emp200]
    println(p4.printName())
  }
}

class Person200 {
  var name: String = "tom"

  def printName() { //输出名字
    println("Person printName() " + name)
  }

  def sayHi(): Unit = {
    println("sayHi...")
  }
}

//这里我们继承 Person

class Emp200 extends Person200 { //这里需要显式的使用 override
  override def printName() {
    println("Emp printName() " + name) //在子类中需要去调用父类的方法,使用 super super.printName()
//    sayHi()
  }

  def sayHello(): Unit = {

  }
}
