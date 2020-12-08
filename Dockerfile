# For Java 8
 FROM openjdk:8-jdk-alpine
 
 
 ARG JAR_FILE=target/projeto-java.jar

# cp projeto-java.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar