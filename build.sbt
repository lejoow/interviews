name := "interviews"

version := "1.0"

scalaVersion := "2.11.8"
scalaVersion in ThisBuild := "2.11.8"

val akkaActor = "com.typesafe.akka" %% "akka-actor" % "2.5.0"

lazy val commons = (project in file("commons"))
  .settings(
    version := "1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      akkaActor
    )
  )


lazy val akkaInterview = (project in file("akka-test")).dependsOn(commons)
lazy val scalaInterview = (project in file("scala-test")).dependsOn(commons)