lazy val root =
  (project in file("."))
    .settings(
      name := "scalaz-http",
      libraryDependencies ++= Seq(
        "org.scalaz" %% "scalaz-base" % "8.0.0-SNAPSHOT",
        "org.scalaz" %% "scalaz-zio"  % "0.2.6"
      )
    )
    .enablePlugins(BuildInfoPlugin)
    .settings(
      buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
      buildInfoPackage := "scalaz.http",
      buildInfoObject := "BuildInfo"
    )
