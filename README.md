# kotlin-playground
Just having some fun with Kotlin and [Quarkus](https://quarkus.io/) 😎.

#### Running locally
```bash
./gradlew quarkusDev
```

#### Building for production
1. Building a native build to be run on GraalVM
```bash
make nativeBuild
```

2. Building the docker container:
```bash
make build
```

3. Running the container:
```bash
make run
```
