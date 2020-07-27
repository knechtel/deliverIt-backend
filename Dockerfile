FROM openjdk:8
copy ./target/deliver-0.0.1-SNAPSHOT.jar deliver-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","deliver-0.0.1-SNAPSHOT.jar"]
#docker pull mariadb:latest
#docker image build -t deliver .
