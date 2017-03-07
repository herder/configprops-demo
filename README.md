# configprops-demo
Demo for possible bug in Spring-Kotlin

It defines two `ConfigurationProperties` with the same structure - one written in [Java](https://github.com/herder/configprops-demo/blob/master/src/main/java/com/example/SlugServicePropertiesJava.java) and one in [Kotlin](https://github.com/herder/configprops-demo/blob/master/src/main/kotlin/com/example/ConfigProps.kt#L11).
The default values of the Kotlin variant's fields are not preserved by Spring Boot, which the Kotlin test shows.
