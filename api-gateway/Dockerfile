FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
CMD ["java", "-jar", "app.jar"]

# docker build -t api-gateway .
# docker run -d -p 8080:8080 --name="api-gateway" api-gateway