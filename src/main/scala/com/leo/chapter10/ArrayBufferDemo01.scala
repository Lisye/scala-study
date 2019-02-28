package com.leo.chapter10

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {
    var arr01 = ArrayBuffer[Any](3, 2, 5)
    println(arr01(2))

    for(i<-arr01) {
      println(i)
    }

    println("arr01.hash = " + arr01.hashCode())
    arr01.append(90.0, 12)
    println("arr01.hash = " + arr01.hashCode())

    for(i<-arr01) {
      println(i)
    }

    println("=======================")

    arr01.remove(1)
    for(i<-arr01) {
      println(i)
    }
  }
}
