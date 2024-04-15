plugins {
    `java-library`
    `maven-publish`
}

group = "my.best.lib"
version = "0.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-core:2.17.0")
    api("com.google.code.gson:gson:2.10.1")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "library"

            from(components["java"])
        }
    }
}
