package com.leo.chapter03.myfor

object stepfor {
  def main(args: Array[String]): Unit = {

    //    range 控制步长
    for (i <- Range(1, 10, 2)) {
      println("i = " + i)
    }

    //    循环守卫控制步长
    for (i <- 1 to 10 if i % 2 == 1) {
      println("i = " + i)
    }
  }
}
