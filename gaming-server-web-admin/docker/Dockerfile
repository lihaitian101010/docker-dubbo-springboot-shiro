FROM openjdk:8
MAINTAINER lihaitian <lihaitian101010@126.com>
ENV DOCKERIZE_VERSION v0.6.0
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
        && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
        && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz
RUN mkdir /app
WORKDIR /app
COPY gaming-server-web-admin.jar app-web.jar
ENTRYPOINT ["dockerize","-timeout","5m","-wait","tcp://192.168.163.130:20880","java","-Djava.security.egd=file:/dev/./urandom","-jar","app-web.jar"]
EXPOSE 8100
