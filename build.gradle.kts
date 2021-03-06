plugins {
    kotlin("jvm") version "1.5.31"
    java
}

group = "br.dargoh.projetospark"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin
    compileOnly(kotlin("stdlib-jdk8"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    // Plugins
    compileOnly(files("libs/HologramAPI_v1.6.2.jar"))
    compileOnly(files("libs/ActionBarAPI-1.5.4.jar"))
    compileOnly(files("libs/BossBarAPI_v2.4.1.jar"))
    compileOnly(files("libs/KotlinBukkitAPI-0.2.0-SNAPSHOT.jar"))
    compileOnly(files("libs/Spigot.jar"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}