FROM openjdk:11
ADD target/todo-server-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
#ARG JAR_FILE=*.jar
#COPY targer/${JAR_FILE} application.jar
###COPY target/todo-server-*.jar /todo-server.jar
#ENTRYPOINT ["java", "-jar", "/application.jar"]

