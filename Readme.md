# Jenkins Agents
Lets manage all Jenkins Agents from the same repo.

***Local Build***
```bash
./gradlew build
```

***Publish Snapshot***
```bash
./gradlew publish
```

***Release***
```bash
./gradlew release -Prelease.useAutomaticVersion=true
```