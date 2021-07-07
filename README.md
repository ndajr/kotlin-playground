# kotlin-playground

#### Running
```bash
make build
make run
```

Received:
```
Error: Could not find or load main class com.projects.kotlinplayground.ApplicationKt
Caused by: java.lang.ClassNotFoundException: com.projects.kotlinplayground.ApplicationKt
```

Expected (check build.gradle.kts to see the version that works):
```
Hello world!
```

#### Runtime Class Path:
```
runtimeClasspath - Runtime classpath of compilation 'main' (target  (jvm)).
+--- org.jetbrains.kotlin:kotlin-stdlib:1.4.0
|    +--- org.jetbrains.kotlin:kotlin-stdlib-common:1.4.0
|    \--- org.jetbrains:annotations:13.0
+--- com.google.cloud:libraries-bom:20.7.0
|    +--- com.google.cloud:google-cloud-pubsub:1.113.3 (c)
|    +--- io.grpc:grpc-api:1.38.1 (c)
|    +--- io.grpc:grpc-context:1.38.1 (c)
|    +--- io.grpc:grpc-stub:1.38.1 (c)
|    +--- io.grpc:grpc-protobuf:1.38.1 (c)
|    +--- io.grpc:grpc-protobuf-lite:1.38.1 (c)
|    +--- com.google.api:api-common:1.10.4 (c)
|    +--- com.google.protobuf:protobuf-java:3.17.3 (c)
|    +--- com.google.api.grpc:proto-google-common-protos:2.3.2 (c)
|    +--- com.google.api.grpc:proto-google-cloud-pubsub-v1:1.95.3 (c)
|    +--- com.google.api.grpc:proto-google-iam-v1:1.0.14 (c)
|    +--- com.google.guava:guava:30.1.1-android (c)
|    +--- com.google.api:gax:1.65.1 (c)
|    +--- com.google.auth:google-auth-library-oauth2-http:0.26.0 (c)
|    +--- com.google.http-client:google-http-client-gson:1.39.2 (c)
|    +--- com.google.api:gax-grpc:1.65.1 (c)
|    +--- io.grpc:grpc-auth:1.38.1 (c)
|    +--- com.google.auth:google-auth-library-credentials:0.26.0 (c)
|    +--- io.grpc:grpc-netty-shaded:1.38.1 (c)
|    +--- io.grpc:grpc-alts:1.38.1 (c)
|    +--- io.grpc:grpc-grpclb:1.38.1 (c)
|    +--- com.google.protobuf:protobuf-java-util:3.17.3 (c)
|    +--- io.grpc:grpc-core:1.38.1 (c)
|    +--- com.google.auto.value:auto-value-annotations:1.8.1 (c)
|    \--- com.google.http-client:google-http-client:1.39.2 (c)
\--- com.google.cloud:google-cloud-pubsub -> 1.113.3
     +--- io.grpc:grpc-api:1.38.0 -> 1.38.1
     +--- io.grpc:grpc-context:1.38.0 -> 1.38.1
     +--- org.codehaus.mojo:animal-sniffer-annotations:1.20
     +--- io.grpc:grpc-stub:1.38.0 -> 1.38.1
     +--- io.grpc:grpc-protobuf:1.38.0 -> 1.38.1
     +--- io.grpc:grpc-protobuf-lite:1.38.0 -> 1.38.1
     +--- com.google.api:api-common:1.10.3 -> 1.10.4
     +--- javax.annotation:javax.annotation-api:1.3.2
     +--- com.google.protobuf:protobuf-java:3.17.2 -> 3.17.3
     +--- com.google.api.grpc:proto-google-common-protos:2.3.2
     +--- com.google.api.grpc:proto-google-cloud-pubsub-v1:1.95.3
     |    +--- com.google.code.findbugs:jsr305:3.0.2
     |    +--- javax.annotation:javax.annotation-api:1.3.2
     |    +--- com.google.auto.value:auto-value-annotations:1.8.1
     |    +--- com.google.guava:failureaccess:1.0.1
     |    +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
     |    +--- org.checkerframework:checker-compat-qual:2.5.5
     |    +--- com.google.errorprone:error_prone_annotations:2.7.1
     |    \--- com.google.j2objc:j2objc-annotations:1.3
     +--- com.google.api.grpc:proto-google-iam-v1:1.0.14
     +--- com.google.guava:guava:30.1.1-android
     +--- com.google.guava:failureaccess:1.0.1
     +--- com.google.guava:listenablefuture:9999.0-empty-to-avoid-conflict-with-guava
     +--- org.checkerframework:checker-compat-qual:2.5.5
     +--- com.google.j2objc:j2objc-annotations:1.3
     +--- com.google.api:gax:1.65.0 -> 1.65.1
     +--- com.google.auth:google-auth-library-oauth2-http:0.26.0
     +--- com.google.http-client:google-http-client-gson:1.39.2
     +--- com.google.code.gson:gson:2.8.7
     +--- com.google.api:gax-grpc:1.65.0 -> 1.65.1
     +--- io.grpc:grpc-auth:1.38.0 -> 1.38.1
     +--- com.google.auth:google-auth-library-credentials:0.26.0
     +--- io.grpc:grpc-netty-shaded:1.38.0 -> 1.38.1
     +--- io.grpc:grpc-alts:1.38.0 -> 1.38.1
     +--- io.grpc:grpc-grpclb:1.38.0 -> 1.38.1
     +--- com.google.protobuf:protobuf-java-util:3.17.2 -> 3.17.3
     +--- org.conscrypt:conscrypt-openjdk-uber:2.5.1
     +--- org.threeten:threetenbp:1.5.1
     +--- com.google.code.findbugs:jsr305:3.0.2
     +--- io.opencensus:opencensus-api:0.28.0
     +--- io.grpc:grpc-core:1.38.0 -> 1.38.1
     +--- com.google.android:annotations:4.1.1.4
     +--- io.perfmark:perfmark-api:0.23.0
     +--- com.google.errorprone:error_prone_annotations:2.7.1
     +--- com.google.auto.value:auto-value-annotations:1.8.1
     +--- com.google.http-client:google-http-client:1.39.2
     +--- org.apache.httpcomponents:httpclient:4.5.13
     +--- commons-logging:commons-logging:1.2
     +--- commons-codec:commons-codec:1.15
     +--- org.apache.httpcomponents:httpcore:4.4.14
     \--- io.opencensus:opencensus-contrib-http-util:0.28.0
```
