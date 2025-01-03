# Stage 1: Build the application
FROM openjdk:17.0.2-jdk-slim-buster AS builder

WORKDIR /app
COPY gradlew build.gradle settings.gradle ./
COPY gradle ./gradle
COPY src ./src

# Set execute permissions and build the jar
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

# Stage 2: Run the application
FROM openjdk:17.0.2-slim-buster

WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]