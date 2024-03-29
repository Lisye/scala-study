package com.leo.chapter05.fundetails

object Details02 {
  def main(args: Array[String]): Unit = {
//    println(getSum(10, 10))
//    println(getSum2(10, 10))
//    println(getSum3(10, 10))
    println(f3("sss"))
    println(f4("sss"))
    println(f5("sss"))
  }

  //如果写了 return ,返回值类型就不能省略
  def getSum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }

  //如果返回值这里什么什么都没有写，即表示该函数没有返回值
  // 这时 return 无效
  def getSum2(n1: Int, n2: Int) {
    return n1 + n2
  }

  //如果函数明确声明无返回值(声明 Unit)，那么函数体中即使使用 return 关键字也不会有返回值
  def getSum3(n1: Int, n2: Int): Unit = {
    return n1 + n2
  }

  def f3(s: String) = {
    if (s.length >= 3)
      s + "123"
    else
      3
  }

  def f4(s: String): Any = {
    if (s.length >= 3)
      s + "123"
    else
      3
  }

  def f5(s: String) {
    if (s.length >= 3)
      s + "123"
    else
      3
  }
}
