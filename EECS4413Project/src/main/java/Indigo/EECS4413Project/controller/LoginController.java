package Indigo.EECS4413Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import Indigo.EECS4413Project.logic.LoginDAO;
import jakarta.ws.rs.core.MediaType;


@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginDAO loginDAO = new LoginDAO();

	@GetMapping(value = "/{username}/{password}",produces = MediaType.APPLICATION_JSON)
	public boolean authenticator(@PathVariable String username,@PathVariable String password) {
		return loginDAO.read(username, password);

	}
	@PostMapping(value = "/{username}/{newPassword}",produces = MediaType.APPLICATION_JSON)
    public void updatePassword(@PathVariable String username, @PathVariable String newPassword) {
            loginDAO.update(username, newPassword);
            System.out.println(username + newPassword);
	}
}
