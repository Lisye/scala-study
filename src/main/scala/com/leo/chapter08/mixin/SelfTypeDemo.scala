package com.leo.chapter08.mixin

object SelfTypeDemo {
  def main(args: Array[String]): Unit = {
    println()
     val conslole1 = new Console1 with Logger
//    val console2 = new Console2 with Logger
  }
}

//Logger 就是自身类型特质,当这里做了自身类型后，那么
// trait Logger extends Exception,要求混入该特质的类也是 Exception 子类
trait Logger {
  // 明确告诉编译器，我就是 Exception,如果没有这句话，下面的 getMessage 不能调用
  this: Exception =>

  def log(): Unit = {
    println(getMessage)
  }
}

class Console1 extends Exception{

}

class Console2 {

}


