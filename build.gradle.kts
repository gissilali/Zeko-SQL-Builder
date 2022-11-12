/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    groovy
    `maven-publish`
}



repositories {
    mavenLocal()
    maven {
        url = uri("https://mvnrepository.com/artifact/")

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
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.0")
    implementation("io.vertx:vertx-core:4.3.4")
    implementation("joda-time:joda-time:2.12.1")
    implementation("io.zeko:zeko-data-mapper:1.6.7")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.0")
    testImplementation("org.jetbrains.kotlin:kotlin-reflect:1.7.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.7.0")
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:2.0.18")
    testImplementation("org.spekframework.spek2:spek-runner-junit5:2.0.18")
    compileOnly("io.vertx:vertx-jdbc-client:4.3.4")
    compileOnly("com.github.jasync-sql:jasync-postgresql:2.1.7")
    compileOnly("com.github.jasync-sql:jasync-mysql:2.1.7")
    compileOnly("com.fasterxml.jackson.core:jackson-databind:2.14.0")
    compileOnly("com.zaxxer:HikariCP:5.0.1")
    compileOnly("io.vertx:vertx-lang-kotlin:4.3.4")
}

group = "io.zeko"
version = "1.4.1-SNAPSHOT"
description = "io.zeko:zeko-sql-builder"
java.sourceCompatibility = JavaVersion.VERSION_11

java {
    withSourcesJar()
    withJavadocJar()
}


buildscript {
    // Serves as a global variable
    // Defines where we get our dependencies
    repositories {
        mavenCentral()
    }
    dependencies {
        val kotlinVersion = "1.7.0"
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

apply {
    plugin("kotlin")
}

dependencies {
    val kotlinVersion = "1.7.0"
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
        groupId = "com.zeko.gissilali"
        artifactId = "zeko-sql-builder"
        version = "1.4.1"
    }
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
