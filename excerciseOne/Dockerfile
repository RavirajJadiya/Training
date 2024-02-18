FROM devopsartifact.jio.com/tps-t2r__dev__dcr/eclipse-temurin:17-jre-alpine-1
ENV TZ=Asia/Kolkata
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN addgroup -S appgroup && adduser -S sihcmp -G appgroup
#RUN useradd sihcmp
USER sihcmp
ADD ./target/exerciseOne.jar exerciseOne.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=dev","exerciseOne.jar"]