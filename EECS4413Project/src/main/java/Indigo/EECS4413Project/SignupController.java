package Indigo.EECS4413Project;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.core.MediaType;


@RestController
@RequestMapping("/signup")
public class SignupController {
	@Autowired
	private SignupDAO signupDAO = new SignupDAO();

	@PostMapping(value = "/createuser",consumes = MediaType.APPLICATION_JSON,produces = MediaType.APPLICATION_JSON)
	@ResponseBody
	public void createuser(User user) throws SQLException {
		signupDAO.create(user);
	}
}
