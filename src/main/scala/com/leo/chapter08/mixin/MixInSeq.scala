package com.leo.chapter08.mixin

object MixInSeq {
  def main(args: Array[String]): Unit = {
    val ff1 = new FF

    val ff2 = new KK with CC with DD

  }
}

trait AA {
  println("A...")
}

trait BB extends AA {
  println("B....")

}

trait CC extends BB {
  println("C....")
}

trait DD extends BB {
  println("D....")
}

class EE { //普通类
   println("E...")
}

class FF extends EE with CC with DD { //先继承了 EE 类，然后再继承 CC 和 DD
   println("F....")
}

class KK extends EE { //KK 直接继承了普通类 EE
   println("K....")
}