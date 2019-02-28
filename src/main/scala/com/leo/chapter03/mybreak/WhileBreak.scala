package com.leo.chapter03.mybreak

import util.control.Breaks._

object WhileBreak {
  def main(args: Array[String]): Unit = {
    var n = 1

    breakable {
      while (n <= 20) {
        n += 1
        println("n = " + n)
        if (n == 18) {
          break()
        }
      }
    }

    print("ok~~")
  }
}
