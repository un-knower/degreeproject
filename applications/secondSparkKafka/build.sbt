name         := "KafkaStream"

version      := "1.0"

scalaVersion := "2.11.6"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1" % "provided"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.1.1"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka-0-8_2.11" % "2.1.1"
resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

//libraryDependencies ++= Seq(
//  "org.apache.spark" % "spark-streaming_2.11" % "2.1.1" % "provided",
//    "org.apache.spark" % "spark-streaming-kafka-0-10_2.11" % "2.1.1",
//    "org.apache.spark" % "spark-core_2.11" % "2.1.1" % "provided"
//)

//resolvers ++= Seq(
//    "Maven Central" at "https://repo1.maven.org/maven2/",
//    "Akka Repository" at "http://repo.akka.io/releases/"
//)
