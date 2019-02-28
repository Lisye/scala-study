package com.leo.chapter08.mixin

object MixInPro {
  def main(args: Array[String]): Unit = {
    val mysql6 = new MySQL6 with DB6{
      override var sal: Int = 10
    }
  }
}

trait DB6 {
  var sal: Int //抽象字段
  var opertype: String = "insert"

  def insert(): Unit = {

  }
}

class MySQL6 {

}
