package com.leo.chapter11

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Exercise01 {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAABBBBBBBBCCCCCDDDDDDD"
    val arr = new ArrayBuffer[Char]()
    val s1 = sentence.foldLeft(arr)(putArry)
    println(s1)

    val map = mutable.Map[Char, Int]()
    val s2 = sentence.foldLeft(map)(counter)
    println(s2)
  }

  def putArry(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }

  def counter(map: mutable.Map[Char, Int], key: Char): mutable.Map[Char, Int] ={
//    if(map.contains(key)){
//      map(key) +=1
//    }else{
//      map(key) = 1
//    }

    map += (key -> (map.getOrElse(key, 0) + 1))

    map
  }
}
