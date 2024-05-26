FROM arm64v8/eclipse-temurin:22-jre-ubi9-minimal
RUN mkdir /app/
COPY job-manager.jar /app/job-manager.jar
EXPOSE 8080
CMD ["java", "-jar", "/app/job-manager.jar"]

