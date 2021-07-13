FROM registry.access.redhat.com/ubi8/ubi-minimal:8.4
COPY ./build/*-runner /app
RUN chmod +x /app
EXPOSE 8080
CMD ["./app", "-Dquarkus.http.host=0.0.0.0"]
