package com.auction;

import java.util.List;

import com.user.User;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/payment")
public class PaymentController {
	
	private PaymentDAO paymentDAO = new PaymentDAO(); 
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers(){
		return paymentDAO.readAll(); 
	}

}
