# Use an appropriate base image
FROM adoptopenjdk:16-jre-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file to the container
COPY jenkins_docker_demo-0.0.1-SNAPSHOT.jar jenkins_docker_demo.jar

# Expose the port your application listens on
EXPOSE 8083

# Set the command to run your application
CMD ["java", "-jar", "jenkins_docker_demo.jar"]

