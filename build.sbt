name := "WorkingHours"
 
version := "1.0" 
      
lazy val `workinghours` = (project in file(".")).enablePlugins(PlayScala)

val slickVersion = "3.3.3"

      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.13.5"

libraryDependencies ++= Seq(guice, ws,
  "io.monix" %% "monix" % "3.4.0",
  "com.github.t3hnar" %% "scala-bcrypt" % "4.3.0",
  "org.webjars" % "swagger-ui" % "3.52.3",

  "com.typesafe.slick" %% "slick" % slickVersion,
  "com.typesafe.slick" %% "slick-hikaricp" % slickVersion,
  "com.typesafe.slick" %% "slick-codegen" % slickVersion,

  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0",

  "org.flywaydb" % "flyway-core" % "7.15.0",

  "org.postgresql" % "postgresql" % "42.2.24",

  "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test,
  "org.scalamock" %% "scalamock" % "5.1.0" % Test,

  "com.pauldijou" %% "jwt-core" % "5.0.0"
)
      