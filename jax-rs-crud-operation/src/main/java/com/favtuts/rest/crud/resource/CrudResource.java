package com.favtuts.rest.crud.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import com.favtuts.rest.crud.model.CrudModel;
import com.favtuts.rest.crud.service.CrudService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/crud")
public class CrudResource {
	
	CrudService service = new CrudService();
	
	@Path("/insertion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public CrudModel addUser(CrudModel user) {
		return service.insertUser(user);
	}
	
	@Path("/retrieve")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<CrudModel> getUser() throws SQLException {
		return service.getUser();
	}
	
	@Path("/retrieveById/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<CrudModel> getUser(@PathParam("id") int id) throws SQLException {
		return service.getUserById(id);
	}
	
	@Path("/updateUser")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public CrudModel updateUser(CrudModel user) {
		return service.updateUser(user);
	}
	
	@Path("/deleteUserById/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public int deleteUser(@PathParam("id") int id) {
		return service.deletUser(id);
	}
}
