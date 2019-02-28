package com.leo.chapter09

object ImplicitDemo02 {
  def main(args: Array[String]): Unit = {
    // 编写一个隐式函数，丰富mysql 功能
    implicit def addDelete(mySQL: MySQL):DB = {
      new DB
    }

    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete()
    mySQL.update()
  }
}

class MySQL {
  def insert(): Unit = {
    println("insert")
  }
}

class DB {
  def delete(): Unit = {
    println("delete")
  }

  def update(): Unit = {
    println("update")
  }
}

class Dog {}

