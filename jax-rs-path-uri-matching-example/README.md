# JAX-RS @Path URI matching example

* https://www.favtuts.com/jax-rs-path-uri-matching-example/

# Maven commands

Create WebApp
```
mvn archetype:generate -DgroupId=com.favtuts.common -DartifactId=jax-rs-path-uri-matching-example -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```

Convert to Eclipse web project.
```
mvn eclipse:eclipse -Dwtpversion=2.0
```

# How to start

```bash
$ https://github.com/favtuts/java-jax-rs-tutorials.git

$ cd jax-rs-path-uri-matching-example
```

Run the web project on Tomcat or JBoss server, then test URLs:
```
Test 1 : http://localhost:8080/jax-rs-path-uri-matching-example/users
Test 2 : http://localhost:8080/jax-rs-path-uri-matching-example/users/vip
Test 3 : http://localhost:8080/jax-rs-path-uri-matching-example/users/favtuts
Test 4 : http://localhost:8080/jax-rs-path-uri-matching-example/users/abcdefg
Test 5 : http://localhost:8080/jax-rs-path-uri-matching-example/users/999
Test 6 : http://localhost:8080/jax-rs-path-uri-matching-example/users/123456
Test 7 : http://localhost:8080/jax-rs-path-uri-matching-example/users/username/aaa
Test 8 : http://localhost:8080/jax-rs-path-uri-matching-example/users/username/a9
Test 9 : http://localhost:8080/jax-rs-path-uri-matching-example/users/books/999
```