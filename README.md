# discord-json

## Releasing to N3TWORK Nexus Repository

Branch from the commit you want to release with a branch name like `release/<original version>-N3.<number>`.

Cherry-pick this commit onto that branch.

Update `gradle.properties` so that `version=<original version>-N3.<number>`.

Make sure `sonatypeUsername` and `sonatypePassword` are set to your username/password for the Nexus repository in `~/.gradle/gradle.properties`.

Run `./gradlew publishAllPublicationsToMavenRepository`.

Don't merge this branch back so that it's easy to fetch updates from upstream.

[![Maven Central](https://img.shields.io/maven-central/v/com.discord4j/discord-json.svg?style=flat-square)](https://search.maven.org/artifact/com.discord4j/discord-json)
[![GitHub Workflow Status (branch)](https://img.shields.io/github/workflow/status/Discord4J/discord-json/Java%20CI/master?logo=github&style=flat-square)](https://github.com/Discord4J/discord-json/actions)

Discord entity domain now available as [immutable](https://immutables.github.io/) [Jackson](https://github.com/FasterXML/jackson-databind) objects. Building this project requires JDK 11.
