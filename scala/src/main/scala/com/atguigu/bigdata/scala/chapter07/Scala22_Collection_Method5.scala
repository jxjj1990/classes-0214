package com.atguigu.bigdata.scala.chapter07

/**
 * @author wx
 * @create 2020-05-27 9:36
 */
object Scala22_Collection_Method5 {
  def main(args: Array[String]): Unit = {
    //Scala - 集合 - 常用方法 - 折叠
    val dataList = List(1, 2, 3, 4)
    //fold方法存在函数柯里化，有2个参数列表
    //第一个参数列表中的参数 => z : A1 【z表示zero，表示数据处理的初始值】
    //第二个参数列表中的参数 => (A1,A1)=>A1 【聚合数据的逻辑】

    //fold方法在进行数据处理时，外部的数据应该和集合内部的数据的类型保持一致
    //
    //val i: Int = dataList.fold(5)(_ + _)
    //从源码的角度讲 ，fold方法的底层其实就是foldLeft
    //fold,foldLeft,foldRight的方法的返回值类型为初始值的类型
    val str: String = dataList.foldLeft("")(_ + _)
    val i: Int = dataList.foldRight(5)(_ + _)
    println(i)

  }


}
