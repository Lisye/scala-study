package com.leo.chapter12

object MatchDemo01 {
  def main(args: Array[String]): Unit = {
    val oper = '-'
    val n1 = 20
    val n2 = 10

    val res = oper match {
      case '+' => n1 + n2
      case '-' => n1 - n2
      case '*' => n1 * n2
      case '/' => n1 / n2
      case _ => println(oper)
    }

    println(res)

    for (ch <- "+-3") {
      var sign = 0
      var digit = 0

      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        case _ if ch.toString.equals("3") => digit = 3
        case _ if (ch > 1110 || ch < 20) => println("ch>10")
        case _ => sign = 2
      }
    }
  }
}
