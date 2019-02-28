package com.leo.chapter11

object HighOrderFunDemo02 {
  def main(args: Array[String]): Unit = {
    test2(sayOk)
  }

  def test2(f:()=>Unit) = {
    f()
  }

  def sayOk() = {
    println("say Ok")
  }
}
