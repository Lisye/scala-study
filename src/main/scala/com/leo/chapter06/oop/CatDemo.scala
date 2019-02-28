package com.leo.chapter06.oop

object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    cat.name = "小白"
    cat.age = 3
    cat.color = "white"

    printf("\n info: %s %d %s", cat.name, cat.age, cat.color)
  }
}

class Cat{
  var name: String = ""
  var age: Int = _
  var color: String = _
}
