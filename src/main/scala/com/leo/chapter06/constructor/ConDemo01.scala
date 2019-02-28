package com.leo.chapter06.constructor

object ConDemo01 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("scala", 20)
    println(p1.name)
    println(p1.age)

    val p2 = new Person("tom")
    println(p2.name)
  }
}

class Person(inName: String, inAge: Int) {
  var name: String = inName
  var age: Int = inAge

  age += 10
  println("~~~~~~~~~~")

  override def toString: String = {
    "name = " + this.name + "\t age = " + this.age
  }

  println("ok!!!!")
  println("age = " + age)

  def this(name: String){
    //辅助构造器，必须在第一行显式调用主构造器(可以是直接，也可以是间接)
    this("jack", 10)
    this.name = name
  }
}

class A{

}
