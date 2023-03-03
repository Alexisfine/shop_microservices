FROM openjdk:17-oracle
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar eureka-server.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]