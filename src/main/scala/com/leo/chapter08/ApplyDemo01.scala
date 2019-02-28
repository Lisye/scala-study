package com.leo.chapter08

object ApplyDemo01 {
  def main(args: Array[String]): Unit = {
    val pig = new Pig("pig")
    pig.showName()

    val pig1 = Pig("猪八戒")
    pig1.showName()

    val pig2 = Pig() // 必须带括号（）
//    val pig2 = Pig //error
    pig2.showName()
  }
}

class Pig(pName: String) {
  var name: String = pName

  def showName(): Unit = {
    println(name)
  }
}

//在伴生对象中定义 apply 方法，可以实现: 类名(参数) 方式来创建对象实例.
object Pig {
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("nick")
}