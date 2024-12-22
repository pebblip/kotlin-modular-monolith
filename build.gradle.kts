plugins {
    id("kotlin-modular-monolith-common")
    id("com.github.johnrengelman.shadow") version "8.1.1"    
}

dependencies {
    implementation(project(":user")) 
    implementation(project(":cli"))
}

tasks {
    named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
        archiveBaseName.set("user-management")
        archiveVersion.set("1.0.0")
        manifest {
            attributes["Main-Class"] = "gucchi.cli.MainKt"
        }        
    }
}


