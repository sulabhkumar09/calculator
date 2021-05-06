FROM openjdk:8
EXPOSE 8080
ADD target/calculator.war calculator.war
CMD ["java","-war","/calculator.war"]