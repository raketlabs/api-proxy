FROM openjdk:11
EXPOSE 8080
ADD target/api-proxy-1.0.jar api-proxy-1.0.jar
ENTRYPOINT ["java", "-jar", "api-proxy-1.0.jar"]
