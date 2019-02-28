package com.leo.chapter05.fundetails

object DetailParameter05 {

  //  如果函数存在多个参数，每一个参数都可以设定默认值，那么这个时候，传递的参数到底是覆 盖默认值，还是赋值给没有默认值的参数，就不确定了(默认按照声明顺序[从左到右])。在这种情况下， 可以采用带名参数
  def main(args: Array[String]): Unit = {
    mysqlCon()
    println()
    mysqlCon("127.0.0.1", 6666)
    println()

    //如果我们希望指定覆盖某个默认值，则使用带名参数即可,比如修改用户名和密码
    mysqlCon(user = "tom", pwd = "123")
    println()
    f6("v2", "v3")
    println()
    f6(p1 = "p1", "p2")
    f6(p2 = "p2")
  }

  def mysqlCon(add: String = "localhost", port: Int = 3306, user: String = "root", pwd: String = "root"): Unit = {
    println("add = " + add)
    println("port = " + port)
    println("user = " + user)
    println("pwd = " + pwd)
  }

  def f6(p1: String = "v1", p2: String): Unit = {
    println(p1 + p2)
  }

  //  递归函数未执行之前是无法推断出来结果类型，在使用时必须有明确的返回值类型
  //  def f8(n: Int) = {  // 错误，递归不能使用类型推断，必须指定返回值类型
  //    if (n <= 0)
  //      1
  //    else
  //      n * f8(n)
  //  }

  //  Scala函数支持可变参数
  //  支持0到多个参数
  def sum(arg: Int*) { //args 是集合, 通过 for 循环 可以访问到各个值。

  }

  //  支持1到多个参数
  def sum2(n1: Int, args: Int*): Unit = {

  }



}
