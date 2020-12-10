# For Java 8
FROM openjdk:8-jdk-alpine
 
ARG JAR_FILE=target/projeto-java.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]

EXPOSE 8080

CMD ["java", "-Dspring.data.mongodb.uri=mongodb://127.0.0.1:27017/test"]

