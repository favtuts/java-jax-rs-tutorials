# RESTEasy Tutorial with Eclipse and Tomcat

* https://www.favtuts.com/resteasy-tutorial-with-eclipse-and-tomcat/

# Maven commands

* Eclipse clean

```
mvn eclipse:clean
```

* Convert to Eclipse web project.
```
mvn eclipse:eclipse
```

* Maven clean build
```
mvn clean install
```

# How to start

```bash
$ https://github.com/favtuts/java-jax-rs-tutorials.git

$ cd resteasy-eclipse-tomcat-tutorial
```

Run the web project on Tomcat or JBoss server, then perform test cases:

* 1 - getDummy

```
curl --location --request GET 'http://localhost:8080/resteasy-eclipse-tomcat-tutorial/employee/99/getDummy'
```

* 2 - ddEmployee

```
curl --location --request POST 'http://localhost:8080/resteasy-eclipse-tomcat-tutorial/employee/add' \
--header 'Content-Type: application/xml' \
--data-raw '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<employee>
    <id>1</id>
    <name>Pankaj</name>
    <salary>9999.50</salary>
</employee>'
```

* 3 - get by ID

```
curl --location --request GET 'http://localhost:8080/resteasy-eclipse-tomcat-tutorial/employee/1/get'
```

* 4 - getAll

```
curl --location --request GET 'http://localhost:8080/resteasy-eclipse-tomcat-tutorial/employee/getAll'
```

* 5 - delete

```
curl --location --request DELETE 'http://localhost:8080/resteasy-eclipse-tomcat-tutorial/employee/50/delete'
```