# Portfolio-BackEnd

## About the project

This service is a spring boot application responsible for mananging portfolios, it is part of the final work of the program "argentina programa".

This api is consumed by a client made in angular, which will receive a json file with all the portfolio data, and may return another one to the api to rewrite some data.

## Getting started

The requeriments to start developing usig this project are:
* java development kit 1.17
* java runtime enviorment 1.17
* mysql server
* maven 3.8.6
* git

To start using this project, clone the repository with the following command:
```
    git clone https://github.com/TomasMaggi/portfolio-BackEnd.git
```

then move to the root of the project using:
```
    cd portfolio-BackEnd
```

now you need to build the project, for this you need to have [maven](https://maven.apache.org/download.cgi) installed, then build the project writing:
```
    mvn install
```
now you need to edit the .propieties file, where is in  ```[root]/src/main/resources/application.properties```  to allow to springboot to create a database in your mysql server instance:
```
    spring.datasource.username=[a username that you created]
    spring.datasource.password=[a password that you created]
```
remember to give to that user autorities about tg

remember to give the user the necessary permissions to create and edit the database.
```
    mvn spring-boot:run
```

## Used libraries

the following libraries were used for this project:

 * [spring web](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#spring-web)
 * [lombok](https://projectlombok.org/api/)
 * [spring jpa](https://spring.io/projects/spring-data-jpa)
 * [spring mysqldriver](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/#requirements)
