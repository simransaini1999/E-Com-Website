package Indigo.EECS4413Project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.MediaType;

//import java.sql.SQLException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/signup")
public class SignupController {
	@Autowired
	private SignupDAO signupDAO;

	@PostMapping(value = "/createuser",consumes = MediaType.APPLICATION_JSON,produces = MediaType.APPLICATION_JSON)
//	@ResponseBody
	public void createuser(User user)  {
		signupDAO.create(user);
	}
}
