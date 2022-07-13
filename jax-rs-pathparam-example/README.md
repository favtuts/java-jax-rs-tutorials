# JAX-RS @PathParam example

* https://www.favtuts.com/jax-rs-pathparam-example/

# Maven commands

Create WebApp
```
mvn archetype:generate -DgroupId=com.favtuts.common -DartifactId=jax-rs-pathparam-example -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```

Convert to Eclipse web project.
```
mvn eclipse:eclipse -Dwtpversion=2.0
```

# How to start

```bash
$ https://github.com/favtuts/java-jax-rs-tutorials.git

$ cd jax-rs-pathparam-example
```

Run the web project on Tomcat or JBoss server, then test URLs:
```
Test 1 : http://localhost:8080/jax-rs-pathparam-example/users/22667788
Test 2 : http://localhost:8080/jax-rs-pathparam-example/users/2011/06/30
```