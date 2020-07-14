package com.atguigu.bigdata.scala.chapter07

import scala.collection.mutable.ListBuffer

/**
 * @author wx
 * @create 2020-05-27 9:36
 */
object Scala09_Collection_Set {
  def main(args: Array[String]): Unit = {
    //Scala - 集合 - Set -集
    //默认的集合为不可变集合

    //java : Set 无序，不可重复

    //    val set: Set[Int] = Set(1, 2, 3, 4)
    //    val newSet: Set[Int] = set + 5
    //    println(set eq newSet)
    //    println(set)
    //    println(newSet)
    //scala Set
    // 无序 ：插入顺序
    //val set: Set[Int] = Set(1, 2, 3, 4, 5, 6, 7, 8)
    // 不可重复
    val set: Set[Int] = Set(1, 2, 3, 4, 1, 2, 3, 4)
    println(set)

  }

}
