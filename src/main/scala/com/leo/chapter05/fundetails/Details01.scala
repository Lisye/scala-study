package com.leo.chapter05.fundetails

object Details01 {
  def main(args: Array[String]): Unit = {
    val tiger = new Tiger
    val tiger2 = test(10, tiger)
    println(tiger.name)
    println(tiger2.name)
  }

  def test(n1: Int, tiger: Tiger): Tiger = {
    println("n1 = " + n1)
    tiger.name = "jack"
    tiger
  }

  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }

  def getSum(n1: Int, n2: Int) = {
    n1 + n2
  }


}

class Tiger {
  var name = ""
}