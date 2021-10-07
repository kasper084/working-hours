logLevel := Level.Warn

resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
resolvers += "iheart-sbt-plugin-releases" at "https://dl.bintray.com/iheartradio/sbt-plugins"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.8")
addSbtPlugin("com.iheart" % "sbt-play-swagger" % "0.9.1-PLAY2.8")
addSbtPlugin("io.github.davidmweber" % "flyway-sbt" % "7.4.0")