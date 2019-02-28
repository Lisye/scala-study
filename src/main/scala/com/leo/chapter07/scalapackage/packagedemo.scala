
package com.atguigu {

  package scala {

    class Person {
      val name = "Nick"

      def play(msg: String): Unit = {
        println(this.name + " " + msg)
      }
    }

    class User {
      def testUser(): Unit = {
        println("name = " + name) //使用包对象中的定义的属性
        sayHiv() //使用包对象中定义的方法
      }
    }

    object Test100 {
      def main(args: Array[String]): Unit = {

        val p = new Person

        val u = new User
        println(u.testUser())
        sayHiv() //使用包对象定义的方法

        println("ok")

        val user = new User

        val user2 = new com.atguigu.User
      }
    }

  }

  class User {
    //    父包要访问子包的内容时，需要 import 对应的类等
    def sayHi(): Unit = {
      import com.atguigu.scala2.Monster
      val monster = new Monster
    }
  }

  package scala2 {

    class User {

    }

    class Monster{}

  }

  package object scala{ // com.atguigu.scala 的包对象
    var name = "King"

    def sayHiv(): Unit = {
      println("package object scala sayHi")
    }
  }

}
