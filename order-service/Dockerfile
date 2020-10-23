FROM openjdk:8-jdk-alpine
EXPOSE 8082
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
CMD ["java", "-jar", "app.jar"]

# docker build -t order-service .
# docker run -d -p 8082:8082 --name="order-service" order-service