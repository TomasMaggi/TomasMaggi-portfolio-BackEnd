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
* Docker

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

now you need to edit the .propieties file, where is in  ```[root]/src/main/resources/application.yaml```  to allow to springboot to create a database in your mysql server instance:

```
    url: [url to your local db]
    username: [your usename]
    passwor: [your password]
```

remember to give to that user autorities about tg and give the user the necessary permissions to create and edit the database.

```
    mvn spring-boot:run
```

## How to use

When you have this running locally, you can perform get request to this end points and get all the entities saved in that category.

this a complete list of all endopoint when you can do a get request:

```
 api/v1/persona/
 api/v1/contact/
 api/v1/experience/
 api/v1/portfolio/
 api/v1/education/
 api/v1/skill/
 ```
 is posible get individual entity if you specify an id like this:
 ```
 api/v1/persona/1
 ```
 
If you want to add more entities, you will have to make a post to the endpoint of the corresponding entity along with a json with the information you want to add, but in order to do this you need a jwt, to get one you will have to authenticate yourself in the following url: 

```
api/v1/auth/auth/authenticate
```

Here you send an email and a password, if success, the app will give you a jwt.

If you dont have any user registered yet, you can uncomment the register controller and register one.

## Used libraries

the following libraries were used for this project:

 * [spring web](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#spring-web)
 * [lombok](https://projectlombok.org/api/)
 * [spring jpa](https://spring.io/projects/spring-data-jpa)
 * [spring mysqldriver](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/#requirements)
 * [spring security](https://docs.spring.io/spring-security/reference/index.html)
