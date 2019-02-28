package com.leo.chapter12

object MatchTypeDemo {
  def main(args: Array[String]): Unit = {
    val a = 1
    val obj = if (a == 1) 1
    else if (a == 2) "2"
    else if (a == 3) BigInt(3)
    else if (a == 4) Map("aa" -> 1)
    else if (a == 5) Map(1 -> "aa")
    else if (a == 6) Array(1, 2, 3)
    else if (a == 7) Array("aa", 1)
    else if (a == 8) Array("aa")

    val res = obj match {
      case a: Int => a
      case b: Map[String, Int] => "对象是一个字符串-数字的 Map 集合"
      case c: Map[Int, String] => "对象是一个数字-字符串的 Map 集合"
      case d: Array[String] => d
      case e: Array[Int] => "对象是一个数字数组"
      case f: BigInt => Int.MaxValue
      case _ => "nothing"
    }

    println(res)

  }
}
