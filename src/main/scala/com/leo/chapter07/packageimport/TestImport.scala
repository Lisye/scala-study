package com.leo.chapter07.packageimport

import scala.collection.mutable._

object TestImport {
  def main(args: Array[String]): Unit = {
    val u = new User
  }
}

class User {

  import scala.beans.BeanProperty

  @BeanProperty var name: String = ""

  val age: Int = 20

  def test(): Unit = {
    import scala.collection.mutable.{HashMap, HashSet}
    var map = new HashMap
    var set = new HashSet
  }

  def test2(): Unit = {
    import java.util.{HashMap => JavaHashMap, List}
    import scala.collection.mutable._

    var map = new HashMap()
    var map1 = new JavaHashMap()

  }

  def test3(): Unit = {
    import java.util.{HashMap => _, _}
    var map = new HashMap()
  }
}
