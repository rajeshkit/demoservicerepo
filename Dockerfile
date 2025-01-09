FROM openjdk:17
COPY ./target/demoservice.jar demoservice.jar
CMD ["java","-jar","demoservice.jar"]