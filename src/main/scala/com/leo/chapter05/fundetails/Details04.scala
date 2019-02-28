package com.leo.chapter05.fundetails

object Details04 {
  def main(args: Array[String]): Unit = {
    println(sayOK())
    println(sayOK("hello "))
  }

//  Scala函数的形参，在声明参数时，直接赋初始值(默认值)，这时调用函数时，如果没有指定实
//参，则会使用默认值。如果指定了实参，则实参会覆盖默认值。
  def sayOK(name: String = "jack"): String = {
    return name + "ok!"
  }
}
