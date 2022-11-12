/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    java
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("http://mvnrepository.com/artifact/")

        // isAllowInsecureProtocol = true
    }

    maven {
        url = uri("https://jcenter.bintray.com/")
    }

    maven {
        url = uri("https://dl.bintray.com/spekframework/spek-dev")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.20")
    implementation("io.vertx:vertx-core:4.1.1")
    implementation("joda-time:joda-time:2.9.7")
    implementation("io.zeko:zeko-data-mapper:1.6.7")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.20")
    testImplementation("org.jetbrains.kotlin:kotlin-reflect:1.6.20")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.6.20")
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.9")
    testImplementation("org.spekframework.spek2:spek-runner-junit5:2.0.9")
    compileOnly("io.vertx:vertx-jdbc-client:4.1.1")
    compileOnly("com.github.jasync-sql:jasync-postgresql:1.2.3")
    compileOnly("com.github.jasync-sql:jasync-mysql:1.2.3")
    compileOnly("com.fasterxml.jackson.core:jackson-databind:2.11.4")
    compileOnly("com.zaxxer:HikariCP:5.0.1")
    compileOnly("io.vertx:vertx-lang-kotlin:4.1.1")
}

group = "io.zeko"
version = "1.4.1-SNAPSHOT"
description = "io.zeko:zeko-sql-builder"
java.sourceCompatibility = JavaVersion.VERSION_11

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
