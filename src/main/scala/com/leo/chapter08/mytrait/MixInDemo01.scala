package com.leo.chapter08.mytrait

object MixInDemo01 {
  def main(args: Array[String]): Unit = {
    val oracleDB = new OracleDB with Operate3
    oracleDB.insert(1)

    val mySql = new MySql3 with Operate3
    mySql.insert(2)

    val mysql_ = new Mysql_ with Operate3 {
      override def say(): Unit = {
        println("say")
      }
    }

    mysql_.say()
    mysql_.insert(3)

  }
}

trait Operate3 {
  def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}

class OracleDB {

}

abstract class MySql3 {

}

abstract class Mysql_ {
  def say()
}