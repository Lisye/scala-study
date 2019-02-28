package com.leo.chapter09

class ImplicitVal02 {

  //小结
  //1. 当在程序中，同时有 隐式值，默认值，传值
  //2. 编译器的优先级为 传值 > 隐式值 > 默认值
  //3. 在隐式值匹配时，不能有二义性
  //4. 如果三个 (隐式值，默认值，传值) 一个都没有，就会报错
  def main(args: Array[String]): Unit = {
//    implicit val name: String = "Scala"
//
//    def hello(implicit content: String = "jack"): Unit = {
//      println("Hello " + content)
//    }
//
//    hello
//
//    def hello2(implicit content: String = "jack"): Unit = {
//      println("Hello2 " + content)
//    }
//
//    hello2

    implicit val name: Int = 10

    def hello3(implicit content: String = "jack"): Unit = {
      println("Hello3 " + content)
    }

    hello3

//    def hello4(implicit content: String): Unit = {
//      println("Hello4 " + content)
//    }
//    hello4
  }
}
