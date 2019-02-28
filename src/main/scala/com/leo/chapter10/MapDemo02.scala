package com.leo.chapter10

import scala.collection.mutable

object MapDemo02 {
  def main(args: Array[String]): Unit = {
    val map5 = mutable.Map(("Alice", 10), ("B", "BJ"), ("C", 3))
    map5("A") = 20

    val map4 = mutable.Map(("A", 1), ("B", 2), ("C", 3))
    val map6 = map4 + ("E" -> 1, "F" -> 3)
    println(map6)

    map4 += ("EE" -> 1, "FF" -> 3)
    println(map4)

    map4.remove("EE")
    map4 -= ("FF")
    println(map4)

    val map1 = mutable.Map(("A", 1), ("B", 2), ("C", 3))

    for ((k, v) <- map1) print(k, v)
    println()
    for (k <- map1.keys) print(k)
    println()
    for (v <- map1.values) print(v)
    println()
    for (i <- map1) print(i)
    println()
  }
}
