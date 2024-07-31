
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

resolvers += "HMRC-open-artefacts-maven2" at "https://open.artefacts.tax.service.gov.uk/maven2"
libraryDependencies ++= Seq(
  "uk.gov.hmrc.mongo" %% "hmrc-mongo-play-28" % "0.63.0",
  guice,
  "org.scalatest" %% "scalatest" % "3.2.15" % Test,
  "org.scalamock" %% "scalamock" % "5.2.0" % Test,
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
)

lazy val root = (project in file("."))
  .settings(
    name := "some_project_name"
  )
  .enablePlugins(PlayScala)

libraryDependencies += ws

//"com.typesafe.play" %% "play" % "2.8.16",
//"com.typesafe.play" %% "play-json" % "2.9.4",
//"com.typesafe.play" %% "play-guice" % "2.8.16",