import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm")
    id("org.jetbrains.kotlin.plugin.allopen")
    id("io.quarkus")
}

repositories {
    mavenLocal()
    mavenCentral()
}

group = "com.github.neemiasjnr"
version = "1.0.0-SNAPSHOT"
val quarkusVersion: String by project

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(platform("io.quarkus:quarkus-bom:$quarkusVersion"))
    implementation("io.quarkus:quarkus-resteasy:$quarkusVersion")
    implementation("io.quarkus:quarkus-resteasy-jackson:$quarkusVersion")
    implementation("io.quarkus:quarkus-kotlin:$quarkusVersion")

    testImplementation("io.quarkus:quarkus-junit5:$quarkusVersion")
    testImplementation("io.rest-assured:rest-assured:$quarkusVersion")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

allOpen {
    annotation("javax.ws.rs.Path")
    annotation("javax.enterprise.context.ApplicationScoped")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

sourceSets {
    main {
        java.srcDir("src")
        resources.srcDir("resources")
    }
    test {
        java.srcDir("test")
        resources.srcDir("testresources")
    }
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
        kotlinOptions.javaParameters = true
    }
}
