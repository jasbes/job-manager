FROM alpine/java:22-jre
RUN mkdir /app/
COPY /target/job-manager.jar /app/job-manager.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/job-manager.jar"]
