FROM openjdk:8
MAINTAINER lihaitian <lihaitian101010@126.com>
ENV DOCKERIZE_VERSION v0.6.0
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
        && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
        && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz
RUN mkdir /app
WORKDIR /app
COPY gaming-server-servicce-admin.jar app-service.jar
ENTRYPOINT ["dockerize","-timeout","5m","-wait","tcp://192.168.163.129:3306","java","-Djava.security.egd=file:/dev/./urandom","-jar","app-service.jar"]
EXPOSE 20880
