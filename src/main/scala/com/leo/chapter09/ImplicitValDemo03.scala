package com.leo.chapter09

object ImplicitValDemo03 {
  def main(args: Array[String]): Unit = {
    implicit val str1: String = "jack" //隐式值

    def hello(implicit name: String):Unit = {
      println(name + "hello")
    }

    hello //省略参数，寻找隐式值传入
  }
}
