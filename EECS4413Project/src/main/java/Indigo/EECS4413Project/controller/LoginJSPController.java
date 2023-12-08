package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loginjsp")
public class LoginJSPController {

	@GetMapping("/")
    public String showRegistrationForm() {
        return "Login"; // JSP file name would be "Register.jsp"
    }

}
