package com.leo.chapter07.visit

object Testvist {
  def main(args: Array[String]): Unit = {
    val c = new Clerk
    c.showInfo()
    c.name

    Clerk.test(c)

    val p = new Person
    println(p.name)
    println(p.sal)
//    println(p.age)
  }
}

class Clerk {
  var name: String = "jack"
  private var sal: Double = 9.0
  def showInfo(): Unit = {
    println("name " + name + " sal " + sal)
  }
}

//当一个文件中出现了 class Clerk 和 object Clerk
//1. class Clerk 称为伴生类
//2. object Clerk 的伴生对象
//3. 因为scala设计者将static拿掉, 他就是设计了 伴生类和伴生对象的概念
//4. 伴生类 写非静态的内容 伴生对象 就是静态内容
object Clerk{
  def test(c: Clerk): Unit = {
    println("test() name = " + c.name + " sal " + c.sal) //伴生对象可以使用类中的私有属性，这里体现出在伴生对象中，可以访问 c.sal
  }
}

class Person{

  //这里我们增加一个包访问权限
  //下面 private[visit] : 1，仍然是 private 2. 在 visit 包(包括子包)下也可以使用 name ,相当于扩大访问范围
  private[visit] val name = "jack"
  protected[visit] val sal = 1.1f
  private val age = 20
}
