package com.leo.chapter06.constructor

object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val w = new Worker("w")
    val w2 = new Worker("w2")
    val w3 = new Worker("w3")
  }
}

class Worker(inName: String){
  var name = inName
}

class Worker2(val inName: String){
  var name = inName
}

class Worker3(var inName: String){
  var name = inName
}
