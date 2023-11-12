package com.user;

import jakarta.ws.rs.core.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/signup")
public class SignupController {
	@Autowired
	private SignupDAO signupDAO = new SignupDAO();

	@PostMapping("/")
	@ResponseBody
	public void createBook(String email, String password, String username,String fName, String lName,String streetNumber, String streetName,String postalCode, String city,String country) {
		signupDAO.create(email,password,username,fName,lName,streetNumber,streetName,postalCode,city,country);
	}
}
