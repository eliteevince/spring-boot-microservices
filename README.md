# spring-boot-microservices-calculator

## Description about project
In this project there are two module we have used, One is called **'calculator-operation'** and one is **'calculator-service'**.
in which calculator-service is as a front controller and calculator-operation is use for backend operation.

Colculator-service is communicating with calculator-operation internally using RestTemplete of spring-boot.

### How to run
- Download both module from git repository and unzip wherever you want. 
- then import both project in any IDE. 
- you need to build both project, and run one by one.
- we prefer to run **calculator-operation** first and then **calculator-service**.
- after run both project calculator view page is visible on **'localhost:8080/calculator/'**. 
- enter value in both textbox and press button what you want. the request hit to **'calculator-service'** and from there **'calculator-operation'** is called.
- **'calculator-operation'** send back to **'calculator-service'** and from there we can get the result of our selected operation.
