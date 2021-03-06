package com.atguigu.bigdata.spark.streaming

import org.apache.kafka.clients.consumer.{ConsumerConfig, ConsumerRecord}
import org.apache.spark.SparkConf
import org.apache.spark.streaming.dstream.{DStream, InputDStream, ReceiverInputDStream}
import org.apache.spark.streaming.kafka010.{ConsumerStrategies, KafkaUtils, LocationStrategies}
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
 * @author wx
 * @create 2020-06-13 11:43
 */
object SparkStreaming08_transform {
  def main(args: Array[String]): Unit = {
    val sparkConf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("sparkStreaming")
    val ssc = new StreamingContext(sparkConf, Seconds(3))

    val ds: ReceiverInputDStream[String] = ssc.socketTextStream("localhost", 9999)
    val newDS: DStream[String] = ds.transform(rdd => {
      rdd.map(_ * 2)
    })

    newDS.print()

    //启动采集器
    ssc.start()
    //等待采集器的结束
    ssc.awaitTermination()

    //ssc.stop()

  }
}
