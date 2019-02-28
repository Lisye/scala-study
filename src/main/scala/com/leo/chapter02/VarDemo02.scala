package com.leo.chapter02

object VarDemo02 {
  def main(args: Array[String]): Unit = {

//    类型推导
    var num = 10
    println(num.isInstanceOf[Int])
//    num = 2.3

    var age = 10
    age = 30

    val num2 = 10
//    num2 = 30

    val dog = new Dog
//    dog = new Dog
    dog.age = 10
//    dog.name = "dog"
  }
}

class Dog{
  var age: Int = 0

  val name: String=""
}

class Cat{

}
