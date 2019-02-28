package com.leo.chapter08.innerclass

object ScalaOuterClass {

}

class ScalaOuterClass {
  myouter =>

  //定义两个属性
  var name = "jack"
  private var sal = 800.9

  class ScalaInnerClass {
    def info() = {
      println(myouter.name)
    }
  }

  //这里有一个方法,可以接受 ScalaInnerClass 实例
  //下面的 ScalaOuterClass#ScalaInnerClass 类型投影的作用就是屏蔽 外部对象对内部类对 象的影响
  def test(ic:ScalaOuterClass#ScalaInnerClass): Unit ={
    println(ic)
  }
}
