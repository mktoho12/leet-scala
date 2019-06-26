lazy val root = (project in file(".")).settings(
  name := "LeetCodeWithScala",
  organization := "mk.leetcode",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.13.0",
  scalacOptions ++= Seq("-deprecation", "-feature", "-language:implicitConversions"),
  libraryDependencies += "org.scalaj" %% "scalaj-http" % "2.4.2",
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8"
)
