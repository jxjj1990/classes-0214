package com.atguigu.bigdata.scala.chapter06

/**
 * @author wx
 * @create 2020-05-25 9:08
 */
object Scala10_Method {
  def main(args: Array[String]): Unit = {
    // Scala - 面向对象 - 方法
    // 重载
    //多个方法名称相同，但是参数列表（）不相同
    //数值类型，在重载的方法中如果找不到对应的类型。会从类树往上查找

    //    // 方法的重写
    //    //方法的重写一定要存在父子类
    //子类重写父类的方法，子类重写父类相同方法的逻辑
    //方法名一致，参数列表保持一致，异常范围，访问权限

    //既然父类和子类有相同的方法，形成了方法的重写
    //那么在调用的时候，无法确认到底执行哪一个方法。那么需要遵循 动态绑定机制

    // 动态绑定机制 : 程序执行过程中，如果调用了对象的成员方法时，
    // 会将方法和对象的实际内存进行绑定，然后调用


  }
}
