package com.user;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;



@Path("/signup")
public class SignupController {
	private SignupDAO signupDAO = new SignupDAO();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void createBook(String email, String password, String username, String fName, String lName, String streetNumber,	String streetName, String postalCode, String city, String country) {
	signupDAO.create(email,password,username,fName,lName,streetNumber,streetName,postalCode,city,country);
	}
}
