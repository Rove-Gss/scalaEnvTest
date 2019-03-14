import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
import org.apache.spark.streaming.dstream.DStream;
object scalaStreamingTest {
  def main(args:Array[String]): Unit ={
  val conf = new SparkConf()
    conf.setAppName("Spark Streaming Test")
    conf.setMaster("spark://192.168.80.134:7077")
    val streamContext = new StreamingContext(conf,Seconds(2))//read data per 2 seconds
    val lines = streamContext.textFileStream("file:///usr/testdata/MD.txt")
    val result = lines.flatMap(_.split(" |\\,|\\.|\\?|\\!|\n"))
    result.print()
    streamContext.start()
    streamContext.awaitTermination()
  }
}
