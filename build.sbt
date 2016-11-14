name := """scalaPlay_personsExample"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.sorm-framework" % "sorm" % "0.3.21",
  "com.h2database" % "h2" % "1.3.168",
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

