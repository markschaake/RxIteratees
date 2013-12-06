name := "RxIteratees"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.3"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/service/local/repositories/snapshots/content"

libraryDependencies += "com.netflix.rxjava" % "rxjava-scala" % "0.15.1"

libraryDependencies += "com.typesafe.play" %% "play-iteratees" % "2.2.1"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.4" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")
