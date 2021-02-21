FROM openjdk:15-jdk-alpine
EXPOSE 8085
VOLUME /tmp
ARG JAR_FILE=target/homework-21-docker-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]