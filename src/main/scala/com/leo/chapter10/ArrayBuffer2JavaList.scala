package com.leo.chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {
    // Scala 数组转 Java 的 List
    val arr = ArrayBuffer("1", "2", "3")
    // 隐式函数 bufferAsJavaList 对 arr 进行类型转换 （ ArrayBuffer => Java 的 List类型 ),
    // 使其能够与构造器ProcessBuilder的参数类型匹配
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    val arrList = javaArr.command() // ProcessBuilder实例方法command,返回属性command(类型为 java list),（详见源码）
    println(arrList.get(1))


    //java的List 转成 scala的 ArrayBuffer
    //说明
    //1. asScalaBuffer 是一个隐式函数
    /*
    implicit def asScalaBuffer[A](l : java.util.List[A]) : scala.collection.mutable.Buffer[A] = { /* compiled code */ }
     */
    import scala.collection.JavaConversions.asScalaBuffer
    val scalaArr: mutable.Buffer[String] = arrList
    scalaArr.append("jack")
    println(scalaArr)


    //明确一个知识点
    //当一个类继承了一个 trait //那么该类的实例，就可以传递给这个 trait 引用
    val a01 = new A
    B.test(a01)
  }
}

trait MyTrait01{}
class A extends MyTrait01{}
object B {
  def test(m: MyTrait01): Unit = {
    println("ok")
  }
}
