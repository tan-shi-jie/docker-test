FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER jeecgos@163.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /docker-test

WORKDIR /docker-test

EXPOSE 8080

RUN pwd

ADD  ./docker-test-2.3.0.jar app.jar

RUN sleep 6;

#CMD ["java", "-Djava.security.egd=file:/dev/./urandom" ,"-jar" ,"app.jar"]
CMD ["sh","-c","java", "-jar", "app.jar"]


