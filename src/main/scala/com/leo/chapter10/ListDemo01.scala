package com.leo.chapter10

object ListDemo01 {
  def main(args: Array[String]): Unit = {
    val list01 = List(1, 2, 3)
    println(list01)

    val list02 = Nil
    println(list02)

    println(list01(1))


    val list1 = List(1, 2, 3, "abc")
    val list2 = list1 :+ 4

    println(list1)
    println(list2)

    val list4 = List(1, 2, 3, "abc")
    val list5 = 4 :: 5 :: 6 :: list4 :: Nil
    println(list5)

    val list6 = 4 :: 5 :: 6 :: list4 ::: Nil
    println(list6)

  }
}
