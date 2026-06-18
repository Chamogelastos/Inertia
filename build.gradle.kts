allprojects {
    apply(plugin = "java")

    group = "me.zamin"
    version = "1.0.0"

    repositories {
        mavenCentral()
        maven {
            name = "papermc"
            url = uri("https://repo.papermc.io/repository/maven-public/")
        }
    }
}