package com.atguigu.bigdata.spark.streaming

import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.{DStream, ReceiverInputDStream}
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
 * @author wx
 * @create 2020-06-13 11:43
 */
object SparkStreaming02_Window {
  def main(args: Array[String]): Unit = {
    val sparkConf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("sparkStreaming")
    val ssc = new StreamingContext(sparkConf, Seconds(3))
 

    // 执行逻辑
    // 一行行获取
    val socketDS: ReceiverInputDStream[String] = ssc.socketTextStream("localhost", 9999)



    //启动采集器
    ssc.start()
    //等待采集器的结束
    ssc.awaitTermination()

    //ssc.stop()

  }
}
