# For Java 8
FROM openjdk:8-jdk-alpine
 
ARG JAR_FILE=target/projeto-java.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8080