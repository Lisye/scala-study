package com.leo.chapter10

import scala.collection.mutable

object SetDemo01 {
  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3)
    println(set)

    val set2 = mutable.Set(1, 2, "hello")
    println(set2)

    set2.add(4)
    set2 += 6
    set2 +=5
    println(set2)

    set2 -= 2
    set2.remove("hello")
    println(set2)

    for( i<-set2) {
      print(i)
    }
  }
}
