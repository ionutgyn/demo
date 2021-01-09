FROM openjdk:11-jre-slim

COPY target/demo.jar demo.jar

ENTRYPOINT exec java -server -Djava.security.egd=file:/dev/./urandom $JAVA_OPTS -jar /demo.jar
