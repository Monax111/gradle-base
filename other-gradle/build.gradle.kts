plugins {
	java
}

repositories {
	mavenCentral()
	mavenLocal()
}


dependencies {
	implementation("my.best.lib:library:0.0.1")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}



tasks.withType<Test> {
	useJUnitPlatform()
}
