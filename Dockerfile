FROM openjdk:12-alpine
WORKDIR /
ADD ./target/testFinProj.war testFinProj.war
EXPOSE 8080
CMD ["java", "-jar", "testFinProj.war"]
