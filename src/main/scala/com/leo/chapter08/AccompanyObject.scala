package com.leo.chapter08

object AccompanyObject {
  def main(args: Array[String]): Unit = {
    println(ScalaPerson.sex) //true 在底层等价于 ScalaPerson$.MODULE$.sex()
    ScalaPerson.sayHi() //在底层等价于 ScalaPerson$.MODULE$.sayHi()
  }
}

//伴生类
class ScalaPerson {
  var name: String = _
  ScalaPerson.sex
  ScalaPerson.sayHi()
}

//伴生对象
object ScalaPerson { //
  var sex: Boolean = true

  def sayHi(): Unit = {
    println("object ScalaPerson sayHI~~")
  }

  private val person = new ScalaPerson
  person.name
}