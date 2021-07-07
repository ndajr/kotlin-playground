import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    application
    kotlin("jvm") version "1.4.0"
}

application {
    mainClassName = "com.projects.kotlinplayground.ApplicationKt"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.cloud:google-cloud-pubsub:1.113.5")
}

tasks {
    withType<Jar> {
        archiveBaseName.set("kotlin-playground")
        duplicatesStrategy = DuplicatesStrategy.INCLUDE
        manifest {
            attributes["Main-Class"] = "com.projects.kotlinplayground.ApplicationKt"
        }
        from(configurations.runtime.get().map { if (it.isDirectory) it else zipTree(it) })
        exclude("local.properties")
    }
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
        kotlinOptions.freeCompilerArgs = listOf("-Xjsr305=strict")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
    sourceSets["main"].java.srcDir("src")
    sourceSets["test"].java.srcDir("test")
}
