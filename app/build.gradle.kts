plugins {
    id("kotlin-modular-monolith-common")
    application 
}

application {
    mainClass.set("gucchi.app.MainKt")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project(":user"))
}