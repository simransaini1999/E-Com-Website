package Indigo.EECS4413Project;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


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
