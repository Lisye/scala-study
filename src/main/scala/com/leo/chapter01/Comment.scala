package com.leo.chapter01

object Comment {
  def main(args: Array[String]): Unit = {
    println("hello, world")
  }

  /*
   * @deprecated
   * @example
   * @param n1
   * @param n2
   * @return
   */
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}