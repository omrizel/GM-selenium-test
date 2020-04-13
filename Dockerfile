FROM maven:3.6.3-jdk-11-openj9



RUN apt-get update && apt-get install -y gnupg2
RUN curl -sS -o - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add
RUN echo "deb [arch=amd64]  http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google-chrome.list
RUN apt-get -y update
RUN apt-get -y install google-chrome-stable

COPY ~/GM-selenium-test/. /tmp

RUN mvn -f tmp/ test -Dos="LINUX"