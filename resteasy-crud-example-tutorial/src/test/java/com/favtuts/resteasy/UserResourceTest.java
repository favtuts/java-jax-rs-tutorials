package com.favtuts.resteasy;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.favtuts.resteasy.model.User;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // force name ordering
public class UserResourceTest {

	private static final String FULL_PATH = "http://localhost:8080/resteasy-crud-example-tutorial/restapi/users";
	
	@Test
	public void test1ListAllUsers() {
		System.out.println("test1ListAllUsers ...");
		final ResteasyClient client = new ResteasyClientBuilder().build();
		final ResteasyWebTarget target = client.target(FULL_PATH);
		String response = target.request().get(String.class);		
		System.out.println(response);
	}
	
	@Test
	public void test2CreateUser() {
		System.out.println("test2CreateUser ...");
		User user = new User(103L, "Amir", "amir@gmail.com");
		final ResteasyClient client = new ResteasyClientBuilder().build();
		final ResteasyWebTarget target = client.target(FULL_PATH);
		Response response = target.request()
				.post(Entity.entity(user, "application/json"));
		System.out.println(response.getStatus());
		response.close();
	}
	
	@Test
	public void test3UpdateUser() {
		System.out.println("test3UpdateUser ...");
		User user = new User();
		user.setName("Ram");
		user.setEmail("ram@gmail.com");
		final ResteasyClient client = new ResteasyClientBuilder().build();
		final ResteasyWebTarget target = client.target(FULL_PATH + "/100");
		Response response = target.request()
				.put(Entity.entity(user, "application/json"));
		System.out.println(response.getStatus());
		response.close();
	}
	
	@Test
	public void test4DeleteUser() {
		System.out.println("test4DeleteUser ...");
		final ResteasyClient client = new ResteasyClientBuilder().build();
		final ResteasyWebTarget target = client.target(FULL_PATH + "/101");
		Response response = target.request()
				.delete();
		System.out.println(response.getStatus());
        response.close();
        
        final ResteasyWebTarget target1 = client.target(FULL_PATH);
        String response1 = target1.request().get(String.class);
        System.out.println(response1);
	}
}
