package com.leo.chapter07.scalapackage

import scala.beans.BeanProperty

object packageimport {

}

class Manager(var name: String){

//  第一种引入方式（相对路径）
  @BeanProperty var age: Int = _
//  第二种引入方式（相对路径）
  @scala.beans.BeanProperty var age2: Int = _
//  第三种引入方式（绝对路径）   _root_ 指代源码路径
  @_root_.scala.beans.BeanProperty var age3: Int = _

}
