FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER jeecgos@163.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /docker-test

WORKDIR /docker-test

EXPOSE 8080

ADD . /target/docker-test-2.3.0.jar

#CMD sleep 60;java -Djava.security.egd=file:/dev/./urandom -jar docker-test-2.3.0.jar
CMD ["sh", "-c", "java -jar ./target/docker-test-2.3.0.jar"]


