# syntax=docker/dockerfile:1

FROM openjdk:17-alpine

WORKDIR /app

COPY build/libs/MainApplication.jar /app

CMD ["java", "-jar", "MainApplication.jar"]