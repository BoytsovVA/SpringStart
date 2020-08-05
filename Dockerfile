FROM ubuntu
ADD . /src
WORKDIR /src
RUN apt-get update && apt-get install -y openjdk-8-jdk
RUN ./mvnw package -DskipTests
EXPOSE 8080
ADD /target/SpringbootH2Database.jar SpringbootH2Database.jar
ENTRYPOINT ["java","-jar","SpringbootH2Database.jar"]
