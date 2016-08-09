name := "java-tau"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/java-tau"))

startYear := Some(2014)

description := "Provide the important mathematical constant tau"

version := "1.0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test
)

javacOptions in doc ++= Seq("-charset", "UTF-8")
