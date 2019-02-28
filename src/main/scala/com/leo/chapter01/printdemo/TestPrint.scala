package com.leo.chapter01.printdemo

object TestPrint {
  def main(args: Array[String]): Unit = {
    var name: String = "tom"
    var sal: Double = 1.2
    println("hello" + sal + name)

    printf("name=%s, sal=%.2f\n", name, sal)

    println(s"name = $name sal=${sal+1}")
  }
}
