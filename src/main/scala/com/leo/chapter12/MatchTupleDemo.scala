package com.leo.chapter12

object MatchTupleDemo {
  def main(args: Array[String]): Unit = {
    for (pair <- Array((0, 1), (1, 0), (10, 30), (1, 1), (1, 0, 2))) {
      val res = pair match {
        case (0, _) => "0..."
        case (y, 0) => y
        case (x, y) =>(y,x)
        case _ => "othre"
      }

      println(res)
    }
  }
}
