FROM maven:3.9.9-eclipse-temurin-21 as builder
WORKDIR /app
COPY . .
RUN mvn -pl service-one -am clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /app/service-one/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
