import net.researchgate.release.GitAdapter
group = "com.org.gemsys"
version = "$version"

plugins {
    id("net.researchgate.release") version "2.8.0"
    id("com.palantir.docker") version "0.22.1"
}

//release {
//    failOnSnapshotDependencies = true
//    with (propertyMissing("git") as GitAdapter.GitConfig) {
//        requireBranch = "master"
//    }
//}

task("build") {}

tasks {
    "afterReleaseBuild" {
        dependsOn(getTasksByName("publish", true))
    }
}