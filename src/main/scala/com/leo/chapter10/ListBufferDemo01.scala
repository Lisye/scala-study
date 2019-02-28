package com.leo.chapter10

import scala.collection.mutable.ListBuffer

object ListBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val lst0 = ListBuffer[Int](1, 2, 3)
    println(lst0(2))

    for (item<-lst0) {
      println(item)
    }

    val lst1 = new ListBuffer[Int]
    lst1 += 4
    lst1.append(5)
    println(lst1)

    lst0 ++=lst1
    println(lst0)

    val lst2 = lst0 ++ lst1
    println(lst2)

    val lst3 = lst0 :+ 5
    println(lst0)
    println(lst3)

    lst1.remove(1)

    for (item<- lst3) {
      println(item)
    }
  }
}
