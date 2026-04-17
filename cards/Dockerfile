FROM openjdk:17.0.1-jdk-slim AS build
LABEL authors="enzo-gavini"
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/cards-0.0.1-SNAPSHOT.jar"]