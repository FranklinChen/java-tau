import SonatypeKeys._

sonatypeSettings

name := "java-tau"

organization := "com.franklinchen"

profileName := "com.franklinchen" 

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/java-tau"))

startYear := Some(2014)

description := "Provide the important mathematical constant tau"

version := "1.0.0"

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.10" % "test"
)

pomExtra := {
  <url>http://github.com/FranklinChen/java-tau</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
    </license>
  </licenses>
  <scm>
    <connection>scm:git:github.com/FranklinChen/java-tau.git</connection>
    <developerConnection>scm:git:git@github.com:FranklinChen/java-tau.git</developerConnection>
    <url>github.com/FranklinChen/java-tau.git</url>
  </scm>
  <developers>
    <developer>
      <id>FranklinChen</id>
      <name>Franklin Chen</name>
      <url>http://franklinchen.com/</url>
    </developer>
  </developers>
}

javacOptions in doc ++= Seq("-charset", "UTF-8")
