FROM gradle:6.9.2-jdk8 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:8-jdk-alpine
RUN mkdir /server
COPY --from=build /home/gradle/src/EurekaServer/build/libs/EurekaServer-1.0.0.jar /server/EurekaServer.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/server/EurekaServer.jar"]

FROM openjdk:8-jdk-alpine
RUN mkdir /config
COPY --from=build /home/gradle/src/config-server/build/libs/config-server-1.0.0.jar /config/config-server.jar
EXPOSE 9200
ENTRYPOINT ["java", "-jar", "/config/config-server.jar"]
