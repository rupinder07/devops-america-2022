FROM amazoncorretto:11

ADD ./target/nagp-devops-sample-1.0.0-SNAPSHOT.jar /var/lib/service.jar

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "/var/lib/service.jar"]