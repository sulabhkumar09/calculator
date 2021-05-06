FROM tomcat:latest
EXPOSE 8080
ADD target/calculator.war /usr/local/tomcat/webapps/
CMD ["java","/calculator"]