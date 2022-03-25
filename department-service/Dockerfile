FROM openjdk:8-jdk-alpine
RUN mkdir /service
ADD build/libs/department-service-1.0.0.jar /service/department-service.jar
EXPOSE 9003
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "/service/department-service.jar"]
