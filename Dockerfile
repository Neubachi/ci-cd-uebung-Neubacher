# ===== STAGE 1: Build =====
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B -DskipTests=false package && echo "=== Inhalt von /app/target ===" && ls -la /app/target

# ===== STAGE 2: Runtime =====
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/ci-cd-uebung-1.0.0.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
