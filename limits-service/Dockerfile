FROM java:8
ADD target/limits-service-0.0.1.jar app.jar
EXPOSE 8800
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]