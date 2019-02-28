package com.leo.chapter11

object IteratorDemo {
  def main(args: Array[String]): Unit = {
    val iterator = List(1,2,3,4,5).iterator

    while (iterator.hasNext) {
      println(iterator.next())
    }

    for (enum<-iterator) {
      println(enum)
    }
  }
}
