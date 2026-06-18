plugins {
    id("xyz.jpenilla.run-paper") version "3.0.2"
}

dependencies {
    implementation(project(":inertia-api"))
    implementation(project(":inertia-checks"))
    implementation(project(":inertia-core"))
    implementation(project(":inertia-packets"))
    implementation(project(":inertia-version"))
    implementation(project(":inertia-simulation"))
    implementation(project(":inertia-testkit"))

    compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
}