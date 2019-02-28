package com.leo.chapter10

object TupleDemo {
  def main(args: Array[String]): Unit = {

    val t1 = (1, "a", "b", true, 2)
    println(t1._1)
    println(t1.productElement(0))

//      遍历元组
    for (item <- t1.productIterator) {
      println(item)
    }
  }
}
