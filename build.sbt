name := "java-tau"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/java-tau"))

startYear := Some(2014)

description := "Provide the important mathematical constant tau"

version := "1.0.0"

javacOptions ++= Seq(
  "-source", "1.5",
  "-target", "1.5"
)

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.10" % "test"
)
