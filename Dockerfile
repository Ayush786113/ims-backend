FROM openjdk:20-jdk
#EXPOSE 8080
ADD target/policy-0.0.1-SNAPSHOT.jar policy-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "policy-0.0.1-SNAPSHOT.jar"]
