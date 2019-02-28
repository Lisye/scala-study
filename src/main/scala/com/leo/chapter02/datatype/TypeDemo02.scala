package com.leo.chapter02.datatype

object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    println(sayHell)

    var num = 1.2
    var num2 = 1.7f
//    num2=num
    num2 = num.toFloat
  }

  def sayHell: Nothing = {
    throw new Exception("异常")
  }
}
