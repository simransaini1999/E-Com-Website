package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/register")
public class RegisterJSPController {
	
	@GetMapping("/")
    public String showRegistrationForm() {
        return "Register"; // JSP file name would be "Register.jsp"
    }

}
