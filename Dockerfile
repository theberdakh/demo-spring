# Stage 1: Build the application

FROM gradle:7.6.0-jdk20 AS builder

WORKDIR /app

# Copy the project files
COPY . .

# Build the application
RUN gradle build --no-daemon

# Stage 2: Run the application
FROM openjdk:20-jdk-slim

WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/build/libs/*.jar app.jar

# Expose the default Spring Boot port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]