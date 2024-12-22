plugins {
    kotlin("jvm") version "2.1.0"
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("gucchi.cli.MainKt")
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
    archiveBaseName.set("user-management")
    archiveVersion.set("1.0.0")
    manifest {
        attributes["Main-Class"] = "gucchi.cli.MainKt"
    }
}
