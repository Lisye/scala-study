package com.leo.chapter10

import scala.collection.mutable

object MapDemo01 {
  def main(args: Array[String]): Unit = {
    val map1 = Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "BJ")
    println(map1)

    val map2 = mutable.Map("Alice" -> 10, "Bob" -> 20, "Kotlin" -> "BJ")
    println(map2)

    val map3 = new mutable.HashMap[String, Int]
    print(map3)

    val map4 = mutable.Map(("Alice", 10), ("Bob", 20), ("Kotlin", "BJ"))
    println(map4)

    val v1 = map2("Alice")
    print(v1)

    if (map4.contains("Alice")) {
      map4("Alice")
    }else {
      println("not exists")
    }

    println(map4.get("Alice").get)
//    println(map4.get("Alice1").get)

    println(map4.getOrElse("Alice", "default value"))
  }
}
