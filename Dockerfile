FROM 77tv/openjdk-21-jre

WORKDIR /app

COPY target/AutomationService-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "AutomationService-0.0.1-SNAPSHOT.jar"]