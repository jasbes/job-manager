FROM arm64v8/eclipse-temurin:22-jre-ubi9-minimal
COPY job-manager.jar job-manager.jar
EXPOSE 8080
CMD ["java", "-jar", "job-manager.jar"]

