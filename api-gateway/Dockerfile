FROM maven:3.9.9-eclipse-temurin-21 as builder
WORKDIR /app
COPY . .
RUN mvn -pl api-gateway -am clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=builder /app/api-gateway/target/*.jar app.jar
EXPOSE 8180
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
