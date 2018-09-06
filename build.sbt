lazy val root =
  (project in file("."))
    .settings(
      name := "scalaz-http",
      resolvers += "Sonatype OSS Snapshots".at(
        "https://oss.sonatype.org/content/repositories/snapshots"
      ),
      libraryDependencies ++= Seq(
        "org.scalaz" %% "scalaz-base" % "8.0.0-SNAPSHOT",
        "org.scalaz" %% "scalaz-zio"  % "0.2.1+2-ea655328-SNAPSHOT"
      )
    )
    .enablePlugins(BuildInfoPlugin)
    .settings(
      buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
      buildInfoPackage := "scalaz.http",
      buildInfoObject := "BuildInfo"
    )
