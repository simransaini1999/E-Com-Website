package com.auction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.User;


import jakarta.ws.rs.core.MediaType;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentDAO paymentDAO = new PaymentDAO(); 
	
	@GetMapping("/")
	public List<User> getAllUsers(){
		return paymentDAO.readAll(); 
	}

}
