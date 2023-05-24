FROM alpine/git as git
ARG REPO_ADDRESS=https://github.com/benayat/spring-boot-stomp-native
WORKDIR /git
RUN git clone $REPO_ADDRESS .

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
WORKDIR /app
COPY --from=git /git .
RUN chmod +x ./mvnw && ./mvnw clean package
ENTRYPOINT java -jar ./target/*.jar