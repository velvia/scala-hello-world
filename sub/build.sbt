name := "Sub-project"

scalaVersion := "2.9.0-1"

unmanagedSourceDirectories in Compile <<= Seq(baseDirectory(_ / "code" )).join

