package com.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginDAO loginDAO = new LoginDAO();
	
	
	@GetMapping("/")
	public boolean authenticator(@RequestParam String username,@RequestParam String password) {
		return loginDAO.read(username, password);
	
	}
	
	@PutMapping("/forgotpassword")
    
	public void updateForgotPassword(@RequestParam String username, @RequestParam String password) {
		loginDAO.update(username, password);
	}
	


}
