FROM tomcat:latest
EXPOSE 8080
ADD C:/Windows/System32/config/systemprofile/AppData/Local/Jenkins/.jenkins/workspace/docker-pipeline/target/calculator.war /usr/local/tomcat/webapps/
CMD ["java","/calculator"]