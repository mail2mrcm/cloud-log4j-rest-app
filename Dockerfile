FROM openjdk:11
MAINTAINER chandan
COPY target/log4j-rest-1.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
