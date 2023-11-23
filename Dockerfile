FROM openjdk:17
VOLUME /tmp
COPY /target/emp-api-0.0.1-SNAPSHOT.jar emp-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/emp-api.jar"]
