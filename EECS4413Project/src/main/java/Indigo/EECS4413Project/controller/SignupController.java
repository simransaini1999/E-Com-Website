package Indigo.EECS4413Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import Indigo.EECS4413Project.logic.SignupDAO;
import Indigo.EECS4413Project.model.User;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Controller
@Path("/signup")
public class SignupController {
	@Autowired
	private SignupDAO signupDAO;

//	@PostMapping(value = "/createuser",consumes = MediaType.APPLICATION_JSON,produces = MediaType.APPLICATION_JSON)
//
//	public void createuser(@RequestBody User user)  {
//		signupDAO.create(user);
//	}
//	@GetMapping("/")
//    public String showRegistrationForm() {
//        return "Register"; // JSP file name would be "Register.jsp"
//    }
	
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void createStudent(User student) {
    	signupDAO.create(student);
    }
}
