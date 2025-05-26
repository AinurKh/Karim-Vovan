FROM gradle:8.6-jdk17 AS build

WORKDIR /app
COPY build.gradle settings.gradle ./
COPY src ./src

ENV GRADLE_OPTS="-Dorg.gradle.jvmargs=-Xmx2048m -XX:MaxMetaspaceSize=512m"
RUN gradle clean build --no-daemon -x test

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]