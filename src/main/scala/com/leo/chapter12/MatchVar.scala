package com.leo.chapter12

object MatchVar {
  def main(args: Array[String]): Unit = {
    val ch = 'U'
    ch match {
      case '+' => println("ok")
      case mychar => println("ok " + mychar)
      case _ => println("ok~")
    }
  }
}
