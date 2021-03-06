name := "scorex-basics"

resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"

libraryDependencies ++=
    Dependencies.serizalization ++
    Dependencies.akka ++
    Dependencies.p2p ++
    Dependencies.db ++
    Dependencies.spray ++
    Dependencies.testKit ++
    Dependencies.db ++
    Dependencies.logging ++ Seq(
      "org.consensusresearch" %% "scrypto" % "1.+",
      "commons-net" % "commons-net" % "3.+"
  )