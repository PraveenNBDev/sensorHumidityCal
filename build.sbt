name := "sensor-humidity-stat"

version := "0.1"

scalaVersion := "2.11.12"


libraryDependencies++=Seq(
 "org.apache.spark" %% "spark-core" % 2.4.5",
  "org.apache.spark" %% "spark-sql" % "2.4.5",
 "org.scalatest" %% "scalatest" % "2.0.0" % Test

)
