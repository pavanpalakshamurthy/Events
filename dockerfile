FROM openjdk:8-slim
COPY . /usr/src/myapp/
WORKDIR /usr/src/myapp
CMD ["./gradlew", "bootRun"]