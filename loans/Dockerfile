FROM openjdk:17.0.1-jdk-slim AS build
LABEL authors="enzo-gavini"
COPY target/loans-0.0.1-SNAPSHOT.jar loans-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/loans-0.0.1-SNAPSHOT.jar"]