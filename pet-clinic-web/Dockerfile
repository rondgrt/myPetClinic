FROM openjdk:8-jre

RUN useradd -ms /bin/bash appuser

RUN apt-get update
RUN apt-get install jq -y

ENV JAVA_OPTIONS -Djava.security.egd=file:/dev/./urandom
ENV JAVA_APP_DIR /home/appuser/app

ADD target/dependency/BOOT-INF/lib /home/appuser/app/lib
ADD target/dependency/META-INF /home/appuser/app/META-INF
ADD target/dependency/BOOT-INF/classes /home/appuser/app

USER appuser

WORKDIR /home/appuser

#CMD java -cp app:app/lib/* nl.rondgrt.myperclinic.MyPetClinicApplication
CMD ["java", "-cp", "app:app/lib/*", "-Dlogging.config'=/home/appuser/app/logback-spring.xml", "nl.rondgrt.myperclinic.MyPetClinicApplication"]