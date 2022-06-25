package com.favtuts.resteasy.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.favtuts.resteasy.model.User;
import com.favtuts.resteasy.service.UserService;

/*
 * CRUD Rest APIs for User Resource
 * @author FAVTUTS.COM
 * 
 */
@Path("users")
public class UserResource {

	private UserService userService = new UserService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers() {

		List<User> users = userService.findAll();

		if (!users.isEmpty()) {
			return Response.ok(users).build();
		} else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserById(@PathParam("id") Long id) {

		User user = userService.fetchBy(id);

		if (user.getId() != null) {
			return Response.ok(user).build();
		} else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createUser(User user) {
		boolean result = userService.create(user);
		if (result) {
			return Response.ok().status(Response.Status.CREATED).build();
		} else {
			return Response.notModified().build();
		}
	}

	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateUser(@PathParam("id") long id, User user) {
		user.setId(id);
		boolean result = userService.update(user);
		// return Response.ok().status(Response.Status.NO_CONTENT).build();
		if (result) {
			return Response.ok().status(Response.Status.NO_CONTENT).build();
		} else {
			return Response.notModified().build();
		}
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteUser(@PathParam("id") Long id) {
		boolean result = userService.delete(id);
		if (result) {
			return Response.ok().status(Response.Status.NO_CONTENT).build();
		} else {
			return Response.notModified().build();
		}
	}
}
