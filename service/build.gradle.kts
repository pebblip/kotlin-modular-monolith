plugins {
    id("kotlin-modular-monolith-common")
}

dependencies {
    implementation(project(":user"))
    implementation(kotlin("stdlib"))
}


