FROM openjdk:8-jdk-alpine
RUN mkdir /server
ADD build/libs/eureka-server-1.0.0.jar /server/eureka-server.jar
EXPOSE 8761
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "/server/eureka-server.jar"]
