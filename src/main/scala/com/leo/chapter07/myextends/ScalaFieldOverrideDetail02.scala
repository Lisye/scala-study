package com.leo.chapter07.myextends

//1) def只能重写另一个def(即:方法只能重写另一个方法)
//2) val 只能重写另一个 val 属性 或 重写不带参数的 def
//3) var只能重写另一个抽象的var属性
object ScalaFieldOverrideDetail02 {
  def main(args: Array[String]): Unit = {
    val b = new BBBB
    println(b.sal)
//    println(b.sal())

    val b2: AAAA = new BBBB
    println(b2.sal())
    println(b2.sal)
  }
}

class AAAA {
  def sal(): Int = {
    return 10
  }
}

class BBBB extends AAAA {
  override val sal: Int = 20
}