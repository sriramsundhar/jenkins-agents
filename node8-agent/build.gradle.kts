plugins {
    id("com.palantir.docker")
}

docker {
    name = "index.docker.io/${project.name}:${project.version}"
}
task("build") {
    dependsOn("docker")
}
task("publish") {
    dependsOn("dockerPush")
}
