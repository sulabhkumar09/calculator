FROM openjdk:8
EXPOSE 8080
ADD C:/Windows/System32/config/systemprofile/AppData/Local/Jenkins/.jenkins/workspace/first-maven/target/calculator.war calculator.war
ENTRYPOINT ["java","-war","/calculator.war"]