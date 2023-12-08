FROM maven:3.8.5-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package 


FROM openjdk:17
COPY --from=build /home/app/target/EECS4413Project-0.0.1-SNAPSHOT.jar /usr/src/myapp/EECS4413Project.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "/usr/src/myapp/EECS4413Project.jar"]
