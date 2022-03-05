FROM adoptopenjdk/openjdk11:latest
ARG JAR_FILE
ARG MS_PORT
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE ${MS_PORT}