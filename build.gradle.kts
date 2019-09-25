plugins {
    java
    maven
}

group = "me.camdenorrb"
version = "1.0.3"

repositories {
    mavenCentral()
}

dependencies {
    compile("com.google.code.gson:gson:2.8.5")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}