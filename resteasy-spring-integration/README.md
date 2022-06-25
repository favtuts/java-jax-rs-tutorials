# RESTEasy + Spring integration example

* https://www.favtuts.com/resteasy-spring-integration-example/

# Maven commands

Create WebApp
```
mvn archetype:generate -DgroupId=com.favtuts.common -DartifactId=resteasy-spring-integration-example -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```

Convert to Eclipse web project.
```
mvn eclipse:eclipse -Dwtpversion=2.0
```

# How to start

```bash
$ https://github.com/favtuts/java-jax-rs-tutorials.git

$ cd resteasy-spring-integration
```

Run the web project on Tomcat or JBoss server, then test URLs:
```
Test 1 : http://localhost:8080/resteasy-spring-integration-example/customer/print1
Test 2 : http://localhost:8080/resteasy-spring-integration-example/customer/print2
```