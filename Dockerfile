# Сборка приложения
FROM gradle:7.4.2-jdk17 AS build
WORKDIR /app
COPY . .
RUN gradle build --no-daemon -x test

# Запуск приложения
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]