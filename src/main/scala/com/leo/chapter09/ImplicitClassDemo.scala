package com.leo.chapter09

object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {
    implicit class DB1(val m:MySQL1){
      def addSuffix(): String = {
        m + "scala"
      }
    }

    val mysql = new MySQL1
    mysql.sayOk()
    mysql.addSuffix()
  }
}

class DB1 {}
class MySQL1 {
  def sayOk(): Unit = {
    println("sayOk") }
}