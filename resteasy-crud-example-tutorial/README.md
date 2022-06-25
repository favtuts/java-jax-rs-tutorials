# RESTEasy CRUD Example Tutorial

* https://www.favtuts.com/resteasy-crud-example-tutorial/

# How to start

```bash
$ git clone https://github.com/favtuts/java-jax-rs-tutorials.git

$ cd resteasy-crud-example-tutorial
```

Run the web project on Tomcat or JBoss server, then run the unit test
```
mvn test
```

We can use Postman/cURL for testing CRUD APIs:

* List all users
```
curl --location --request GET 'http://localhost:8080/resteasy-crud-example-tutorial/restapi/users'
```

* Create new user
```
curl --location --request POST 'http://localhost:8080/resteasy-crud-example-tutorial/restapi/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id":103,
    "name": "Amir",
    "email": "amir@gmail.com"
}'
```

* Update user info
```
curl --location --request PUT 'http://localhost:8080/resteasy-crud-example-tutorial/restapi/users/100' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Ram",
    "email": "ram@gmail.com"
}'
```

* Delete the user
```
curl --location --request DELETE 'http://localhost:8080/resteasy-crud-example-tutorial/restapi/users/101'
```