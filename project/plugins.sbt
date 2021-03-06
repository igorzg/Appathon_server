logLevel := Level.Warn

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers ++= Seq("mdedetrich-releases" at "http://artifactory.mdedetrich.com/plugins-release")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.1.0")