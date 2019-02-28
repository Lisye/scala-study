package com.leo.chapter05.mylazy

object LazyDemo01 {
  //1) lazy 不能修饰 var 类型的变量
  //2) 不但是 在调用函数时，加了 lazy ,会导致函数的执行被推迟，我们在声明一个变量时，如果给 声明了 lazy ,那么变量值得分配也会推迟。 比如 lazy val i = 10
  def main(args: Array[String]): Unit = {
    lazy val res = sum(10, 20)
    println("------------")
    printf("res = %d", res)
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum() 执行")
    n1 + n2
  }
}
