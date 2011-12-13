name := "Scala Hello World"

scalaVersion := "2.9.0-1"

// sbt defaults to <project>/src/test/{scala,java} unless we put this in
unmanagedSourceDirectories in Test <<= Seq( baseDirectory( _ / "test" ) ).join

libraryDependencies += "org.scalatest" % "scalatest_2.9.0" % "1.6.1"

libraryDependencies += "org.mockito" % "mockito-all" % "1.9.0-rc1"

// This is to prevent error [java.lang.OutOfMemoryError: PermGen space]
javaOptions += "-XX:MaxPermSize=256m"

javaOptions += "-Xmx1024m"

// For the sbt-assembly plugin to be able to generate single JAR files for easy deploys
//seq(sbtassembly.Plugin.assemblySettings: _*)

//jarName in Assembly := "scala-hello-world.jar"

// Proguard settings
seq(proguardSettings: _*)

proguardOptions ++= Seq(keepMain("HelloWorld"))

minJarPath <<= target(_ / "hello-world.jar")
