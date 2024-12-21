plugins {
    kotlin("jvm") 
    id("com.diffplug.spotless")
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

spotless {
    kotlin {
        target("src/**/*.kt")
        targetExclude("buildSrc/**/*.kt")
        ktlint("0.50.0")        
    }
}
