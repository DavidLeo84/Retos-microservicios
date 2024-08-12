FROM eclipse-temurin:17-jdk

EXPOSE 8080
VOLUME /tmp
ADD ./target/microservicio-reto-1-0.0.1-SNAPSHOT.jar microservicio-1.jar

ENTRYPOINT ["java","-jar","microservicio-1.jar"]