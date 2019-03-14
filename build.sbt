name := "scalaEnvTest"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1"
//libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.3"
//libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.7.3"
//libraryDependencies += "org.apache.hadoop" % "hadoop-hdfs" % "2.7.3"
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.2"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "1.6.2"
//libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "1.6.2"
//libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "1.6.2"