package com.leo.chapter10

import scala.collection.mutable

object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    val q1 = new mutable.Queue[Any]

    q1 +=9
    println(q1)

    q1 ++= List(4, 5, 7)
    println(q1)

    q1 += List(10)
    println(q1)

    val queueElement = q1.dequeue()
    println("ele = " + queueElement + " q1 = " + q1)

    q1.enqueue(100, 10, 888)
    println(q1)

    println(q1.head, q1.tail, q1.tail.tail.tail)
  }
}
