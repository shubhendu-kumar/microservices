FROM openjdk:8-jdk-alpine
RUN mkdir /server
ADD build/libs/config-server-1.0.0.jar /server/config-server.jar
EXPOSE 8861
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/urandom", "-jar", "/server/config-server.jar"]
