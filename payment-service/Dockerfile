FROM openjdk:8-jdk-alpine
EXPOSE 8081
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
CMD ["java", "-jar", "app.jar"]

# docker build -t payment-service .
# docker run -d -p 8082:8082 --name="payment-service" payment-service