FROM openjdk:8-jdk-alpine

USER root

RUN apk add tzdata && cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone \
    && apk del tzdata

RUN echo -e "https://mirror.tuna.tsinghua.edu.cn/alpine/v3.4/main\n\
https://mirror.tuna.tsinghua.edu.cn/alpine/v3.4/community" > /etc/apk/repositories

RUN apk --update add curl bash ttf-dejavu && \
      rm -rf /var/cache/apk/*

VOLUME /tmp
ADD sentinel-dashboard.jar app.jar

ENTRYPOINT ["/bin/sh","-c","java \
                            $JAVA_OPTS \
                            -jar /app.jar"]
