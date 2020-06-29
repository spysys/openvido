FROM openjdk:11-slim as runtime
EXPOSE 8080
ENV APP_HOME /app
ENV JAVA_OPTS=""
RUN mkdir $APP_HOME
RUN mkdir $APP_HOME/config
RUN mkdir $APP_HOME/log
VOLUME $APP_HOME/log
VOLUME $APP_HOME/config
WORKDIR $APP_HOME
COPY ./target/*.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Dserver.port=8080 -Djava.net.preferIPv4Stack=true -jar app.jar" ]