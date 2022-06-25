# RESTEasy hello world example

* https://www.favtuts.com/resteasy-hello-world-example/

# Maven commands

Create WebApp
```
mvn archetype:generate -DgroupId=com.favtuts.common -DartifactId=RESTfulExample -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```

Convert to Eclipse web project.
```
mvn eclipse:eclipse -Dwtpversion=2.0
```

# How to start

```bash
$ https://github.com/favtuts/java-jax-rs-tutorials.git

$ cd RESTEasy-Hello-World-Demo/RESTfulExample
```

Run the web project on Tomcat or JBoss server, then test URLs:
```
Test 1 : http://localhost:8080/RESTfulExample/rest/message/favtuts
Test 2 : http://localhost:8080/RESTfulExample/rest/message/hello%20world
```