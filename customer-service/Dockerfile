FROM openjdk:8-jdk-alpine
EXPOSE 8083
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
CMD ["java", "-jar", "app.jar"]

# docker build -t customer-service .
# docker run -d -p 8083:8083 --name="customer-service" customer-service