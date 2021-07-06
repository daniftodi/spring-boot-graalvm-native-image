# Project Scope
The scope of this project is to compare execution time for an application executed with JVM vs compiled to a native image using GraalVM.
Project contains a simple Spring Boot application with one Controller + one endpoint.

# Installing GraalVM (using SDKMan)
0. SKDMan should be installed
1. `sdk install java 20.3.0.r11-grl`
2. `sdk use java 20.3.0.r11-grl`
3. `gu install native-image`
# Usage
1. Execute `./build.sh` 
2. Exercise application (it will generate insights for native image builder in `src/main/resources/META-INF/native-image`)
3. Stop application with `Ctrl+^C`
4. execute `mvn -Pgraal clean package`
5. execute generated binary from `./target

# Results
This application executed with JVM took `~3.5s` to start, when native-image was created, it took `~70ms` to start.
Building a native-image is a relatively expensive operation, it takes about `2:30m` on my machine and about around `8Gb` of memory.

# References
https://sdkman.io/

https://www.graalvm.org/reference-manual/native-image/

https://spring.io/blog/2020/06/10/the-path-towards-spring-boot-native-applications

