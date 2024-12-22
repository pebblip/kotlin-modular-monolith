plugins {
    id("kotlin-modular-monolith-common")
    application 
}

application {
    mainClass.set("gucchi.cli.MainKt")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":service"))
}
