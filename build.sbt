// Project metadata
name := "MyScalaProject"                  // Project name
version := "0.1.0"                         // Project version
scalaVersion := "2.13.8"                   // Scala version used

// Compiler options
scalacOptions ++= Seq(
  "-deprecation",                          // Warn about use of deprecated APIs
  "-feature",                              // Warn about misused language features
  "-unchecked",                            // Additional warnings for pattern matching
  "-encoding", "utf8",                     // Set encoding to UTF-8
  "-Xfatal-warnings"                       // Treat warnings as errors
)

// Dependencies
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.9" % Test, // ScalaTest for unit testing
  "com.typesafe.akka" %% "akka-actor" % "2.6.18",   // Akka Actor for concurrency
  "org.typelevel" %% "cats-core" % "2.7.0"          // Typelevel Cats library for functional programming
  "com.typesafe.play" %% "play-json" % "2.9.2", // JSON library
  "com.auth0" % "java-jwt" % "4.2.1"            // JWT library
  "org.postgresql" % "postgresql" % "42.2.23",        // PostgreSQL driver
  "com.typesafe.slick" %% "slick" % "3.3.3",          // Slick for functional database access
  "com.typesafe.slick" %% "slick-hikaricp" % "3.3.3"  // Slick connection pooling
)


)

// Repository settings (optional)
resolvers += "Akka Repository" at "https://repo.akka.io/releases" // Add custom repositories if needed

// sbt plugins
addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full)
