plugins {
    kotlin("jvm") version "2.1.0"
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("com.diffplug.spotless") version "6.21.0"
}

application {
    mainClass.set("gucchi.app.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain(21) 
}

tasks {
    named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
        archiveBaseName.set("modular-monolith")
        archiveVersion.set("1.0.0")
    }
}


spotless {
    kotlin {
        target("src/**/*.kt")
    }
}
