FROM docker.io/bitnami/java:1.8

WORKDIR /home

COPY target/*.jar /home

ENTRYPOINT java -jar *.jar