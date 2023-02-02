FROM openjdk:17

# ENV SERVER_USERNAME=uiszmt9bxsrwllbf
# ENV SERVER_PASSWORD=2RrFQwLmj2LbBaCdTKB5
# ENV SERVER_URL=jdbc:mysql://uiszmt9bxsrwllbf:2RrFQwLmj2LbBaCdTKB5@bbcdlfupd8e6ro0pus3u-mysql.services.clever-cloud.com:3306/bbcdlfupd8e6ro0pus3u

MAINTAINER TomasMaggi
COPY target/portfolio-1.0.0-SNAPSHOT.jar portfolio-1.0.0-SNAPSHOT.jar/
ENTRYPOINT ["java","-jar","target/portfolio-1.0.0-SNAPSHOT.jar"]
