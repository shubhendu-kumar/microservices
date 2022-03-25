FROM openjdk:8-jdk-alpine
RUN mkdir /service
ADD build/libs/user-service-1.0.0.jar /service/user-service.jar
EXPOSE 9001
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "/service/user-service.jar"]
