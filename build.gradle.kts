plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    implementation("com.fasterxml.jackson.core:jackson-core:2.12.3")

}

tasks.test {
    useJUnitPlatform()
}
