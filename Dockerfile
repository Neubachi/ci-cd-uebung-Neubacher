# ===== STAGE 1: Build =====
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn -B -DskipTests=false package \
 && echo "=== Inhalt von /app/target ===" \
 && ls -la /app/target

# ===== STAGE 2: Runtime (verwundbar für Exercise 04 Teil C) =====
FROM eclipse-temurin:11-jre

# absichtlich unsichere Pakete installieren für Exercise 04 Teil C
RUN apt-get update && apt-get install -y \
    wget \
    curl \
    unzip \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /app

COPY --from=build /app/target/*.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]
