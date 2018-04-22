name := "sttp-client-exmp"

version := "0.1"

scalaVersion := "2.12.5"

libraryDependencies += "com.softwaremill.sttp" %% "core" % "1.1.12"
libraryDependencies += "com.softwaremill.sttp" %% "async-http-client-backend" % "1.1.12"
libraryDependencies += "com.softwaremill.sttp" %% "async-http-client-backend-future" % "1.1.12"
libraryDependencies += "com.softwaremill.sttp" %% "async-http-client-backend-scalaz" % "1.1.12"
libraryDependencies += "io.argonaut" %% "argonaut-scalaz" % "6.2"

libraryDependencies += "com.softwaremill.sttp" %% "akka-http-handler" % "0.0.13"

libraryDependencies += "com.softwaremill.sttp" %% "async-http-client-handler-scalaz" % "0.0.13"
libraryDependencies += "com.softwaremill.sttp" %% "async-http-client-handler-cats" % "0.0.13"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % Test

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
