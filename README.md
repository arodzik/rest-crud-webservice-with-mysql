# rest-crud-webservice-with-mysql

RESTful API webservice responsible formanaging and storing in database simple notes (without the UI part).

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

* Any Java IDE with Apache Maven support. (Created with IntelliJ IDEA)
* MySQL 5.x
* PhpMyAdmin or any other clients to access MySQL database
* Postman or any other REST Clients

### Database setup

There are two ways to set up database for purposes of this assignment:

1. Create your own DB basing on attached script:
  * Install MySQL Server on your machine
  * Open your MySQL access client
  * Run `database_setup_script.sql` on your client
  * In `application.properties` file put:
    - host: localhost:3306/wladymir_new_db
    - username: root
    - password: root
   

2. Connect to previously prepared database hosted online:
  * Put these credentials in `application.properties` file
    - host: f5.host-ed.me:3306/wladymir_new_db
    - username: wladymir_me
    - password: qwerty1236635522
  
  
  Example of `application.properties` file:
  
  ```
# Automatically update the database
spring.jpa.hibernate.ddl-auto=update

# The database connection URL
spring.datasource.url=jdbc:mysql://localhost:3306/wladymir_new_db?useSSL=false

# Username
spring.datasource.username=root

# Password
spring.datasource.password=root

# Define the database platform
spring.jpa.database-platform=org.hibernate.dialect.MySQLMyISAMDialect

# Define the naming strategy
spring.jpa.hibernate.naming-strategy=org.hibernate.cfg.ImprovedNamingStrategy

hibernate.dialect.storage_engine=MyISAM

# Define the default schema
spring.jpa.properties.hibernate.default_schema=schema

```
 
## Running the project




## Authors

* **Adrian Rodizk** 
