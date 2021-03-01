FROM alpine/git as clone
WORKDIR /app
RUN git clone https://github.com/MosinPower/kuber-healthcheck.git

FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY --from=clone /app/kuber-healthcheck /app
RUN mvn install

FROM openjdk:8-jdk-alpine
WORKDIR /app
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=/app/target/*.jar
COPY --from=build ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]