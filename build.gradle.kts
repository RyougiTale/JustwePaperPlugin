plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    // testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
   //  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    compileOnly("io.papermc.paper:paper-api:1.18.2-R0.1-SNAPSHOT")
}

// tasks.getByName<Test>("test") {
//     useJUnitPlatform()
// }

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}