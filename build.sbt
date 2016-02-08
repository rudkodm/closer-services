import sbt._
import CommonUtils._
import Dependencies._

lazy val commonSettings = Seq (
  name := "closer",
  organization := "com.closer",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.10.5"
)

lazy val root = project.in(file("."))
  .enablePlugins(PlayScala)
  .enablePlugins(MongoPlugin)
  .settings(commonSettings)

herokuAppName in Compile := $("heroku.application.name")

resolvers ++= Seq(
  DefaultMavenRepository,
  Resolver.typesafeRepo("Release")
)

libraryDependencies ++= Seq(
  mongoDriver,
  scalaTest,
  scalaTestPlay,
  mockito
)









