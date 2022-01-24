FROM openjdk:11
EXPOSE 8883
ADD target/ms-customer.jar ms-customer.jar
ENTRYPOINT ["java","-jar","/ms-customer.jar"]