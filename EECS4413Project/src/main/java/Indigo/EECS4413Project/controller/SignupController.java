package Indigo.EECS4413Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import Indigo.EECS4413Project.logic.SignupDAO;
import Indigo.EECS4413Project.model.User;
import jakarta.ws.rs.core.MediaType;

@RestController
@RequestMapping("/signup")
public class SignupController {
	@Autowired
	private SignupDAO signupDAO;

	@PostMapping(value = "/createuser",consumes = MediaType.APPLICATION_JSON,produces = MediaType.APPLICATION_JSON)
	public void createuser(@RequestBody User user)  {
		signupDAO.create(user);
	}

}