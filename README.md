# Rest-Spring-Boot
Spring Boot Rest Application

This is a sample Java / Maven / Spring Boot application that can be used as a starter for creating 
a microservice application.

Database configuration:

Create database customers. Predefined username - root. Predefined password - pass.
Change information in properties if required.

spring.datasource.initialize=true spring.datasource.schema=classpath*:database/initDB.sql 
spring.datasource.data=classpath*:database/insertInfo.sql

spring.datasource.url=jdbc:mysql://localhost:3306/rest - database name 
spring.datasource.username=root - username spring.datasource.password=pass - password 
spring.datasource.driver-class-name=com.mysql.jdbc.Driver - driver 
spring.jpa.database=mysql - database type 
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect - dialect

Steps to setup:

1. Clone project from github.               

2. Go to project folder.

3. mvn spring-boot:run.

4. Explore Rest APIs.

The app defines following APIs:

GET /api/customers

POST /api/customers

GET /api/customers/{id}

PUT /api/customers/{id}

DELETE /api/customers/{id}

License.
This product is licensed.


