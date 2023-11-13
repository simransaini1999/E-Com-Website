package Indigo.EECS4413Project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
