package com.user;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/login")
public class LoginController {

	private LoginDAO loginDAO = new LoginDAO();
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public boolean authenticator(String username, String password) {
		return loginDAO.read(username, password);
		
	
	}
	
	@PUT
	@Path("/forgotpassword")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void updateForgotPassword(String username, String password) {
		loginDAO.update(username, password);
	}
	


}
