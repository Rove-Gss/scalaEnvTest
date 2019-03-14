import org.apache.spark.{SparkConf, SparkContext}

object scalaDependenciesTest {
  def main(args:Array[String]) {
    val conf = new SparkConf()
    conf.setAppName("A test for dependencies")
    conf.setMaster("local[2]")
    val context = new SparkContext(conf)
    val file = "C:\\Users\\GuoSanshan\\Desktop\\study\\MD\\MD.txt"
    val logData = context.textFile(file)
    val parsedWords = logData.flatMap{
      line=>val splits = line.toLowerCase().split("\\,|\\.|\\?|\\!| |\\/|\n").filter(x=>x != "")
      splits
    }
    val keyValuePairs = parsedWords.map{
      words=>(words,1)
    }
    val reducedKeyValuePairs = keyValuePairs.reduceByKey((x,y)=>(x+y))
    val orderedKeyValuePairs = reducedKeyValuePairs.sortBy(_._2,true)
    orderedKeyValuePairs.foreach(println)
  }
}
