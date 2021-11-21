#Cinema-Service

##Description:

---
This is the implementation of a cinema service, its purpose - to show the ability to work with Hibernate and Spring framework.
This service implements authentication and authorization with roles "USER" and "ADMIN". Depending on the user's role, different functionality is available.

Functionality available as a "USER" role:
* get a list of all movies;
* get a list of cinema hall;
* get a list of avialable movie session;
* get a list of avialable movie session;
* add tickets to available movie session to your shopping cart;
* get tickets added to the shopping cart;
* complete the order;
* get order history;

The user with the admin role has access to all the functions listed above, and:
* add a new cinema hall;
* add a new movies;
* add a new movie session;
* upgrade movie session by id;
* delete movie session;
* get information about user by email;

##Technologies:

---
* Spring Web
* Spring Security
* REST
* Hibernate
* MySQL
* Maven

##To run this app locally:

---
1. in your computer must be installed java 11, MySQL and Tomcat for run this app;
2. fork this project in your repo and clone it;
3. add your database information to a file __resources/db.properties__:
````
db.driver=YOUR_JDBC_DRIVER(com.mysql.cj.jdbc.Driver)
db.url=URL_ADDRESS_DATABASE(jdbc:mysql://localhost:3306/YOUR_SCHEMA?serverTimezone=UTC)
db.user=DB_USERNAME
db.password=DB_PASSWORD
````
4. run this project using Tomcat's local server;

If the program was launched successfully, you redirect to login page. Here you can use default users to login:

 * as USER: username - user@gmail.com, password - user123;
 * as ADMIN: username - admin@gmail.com, password - admin123;
 