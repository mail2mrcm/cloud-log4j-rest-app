FROM openjdk:11
MAINTAINER chandan
COPY rest-sample-1.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]