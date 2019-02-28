package com.leo.chapter06.constructor

object ConDemo03 {
  def main(args: Array[String]): Unit = {
    val p1 = new Person2()
  }
}

class Person2() {
  var name: String = _
  var age: Int = _

  def this(name: String) {
    this()
    this.name = name
  }

  def this(name: String, age: Int) {
    this()
    this.name = name
    this.age = age
  }

  def this(age: Int) {
    this("nick")
    this.age = age
  }
}

class Person3 private() {  //private 变成私有构造器

}
