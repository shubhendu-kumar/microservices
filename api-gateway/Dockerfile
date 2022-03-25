FROM openjdk:8-jdk-alpine
RUN mkdir /server
ADD build/libs/api-gateway-1.0.0.jar /server/api-gateway.jar
EXPOSE 8961
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "/server/api-gateway.jar"]
