package com.leo.chapter10

import scala.collection.mutable.ArrayBuffer

object Array22ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val arr2 = ArrayBuffer[Int]()
    arr2.append(1, 2, 3)
    println(arr2)
    val newArr = arr2.toArray
    var newArr2 = newArr.toBuffer
  }
}
