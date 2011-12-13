import sbt._

object HelloBuild extends Build {
  lazy val root = Project("hello-world", file(".")).aggregate(sub).
      dependsOn(sub)
  lazy val sub = Project("sub", file("sub"))
}
