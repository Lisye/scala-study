package com.leo.chapter05.fun

object FunDemo01 {
  def main(args: Array[String]): Unit = {
    println("res = " + getRes(1, 2, '-'))
  }

  def getRes(n1: Int, n2: Int, oper: Char) = {
    if (oper == '+') {
      n1 + n2
    } else if (oper == '-') {
      n1 - n2
    } else {
      null
    }
  }
}
