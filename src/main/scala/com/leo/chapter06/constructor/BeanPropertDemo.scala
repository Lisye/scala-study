package com.leo.chapter06.constructor

import scala.beans.BeanProperty

object BeanPropertDemo {
  def main(args: Array[String]): Unit = {

    val car = new Car
    car.name = "bmw"

    car.setName("bc")
    println(car.getName)

  }
}

class Car {
  @BeanProperty var name: String = null
}
