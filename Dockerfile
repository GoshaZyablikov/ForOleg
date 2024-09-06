FROM gradle:8.9-jdk17 AS build
RUN mkdir -p /app
WORKDIR /app
COPY . .
RUN gradle build -x test -i --stacktrace

FROM eclipse-temurin:21-alpine
ARG JAR_FILE=/app/app.jar
ARG USER_ID=65535
ARG GROUP_ID=65535
ARG USER_NAME=spring-user
ARG GROUP_NAME=spring-group

COPY --from=build /app/build/libs/*.jar $JAR_FILE

RUN addgroup -g $GROUP_ID $GROUP_NAME && \
    adduser --shell /sbin/nologin --disabled-password \
    --no-create-home --uid $USER_ID --ingroup $GROUP_NAME $USER_NAME

USER $USER_NAME
WORKDIR /app
ENTRYPOINT ["java","-jar","./app.jar"]