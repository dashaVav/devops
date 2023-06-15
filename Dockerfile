FROM maven:3.8.5-openjdk-17 AS build

WORKDIR /app
COPY . .
RUN mvn clean package


FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/devops-1.0-SNAPSHOT.jar .
CMD ["java", "-jar", "devops-1.0-SNAPSHOT.jar"]
