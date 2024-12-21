plugins {
    id("kotlin-modular-monolith-common")
}

dependencies {
    api(project(":user"))
    implementation(kotlin("stdlib"))
}


