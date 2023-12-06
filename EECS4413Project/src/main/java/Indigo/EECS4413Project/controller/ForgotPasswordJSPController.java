package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForgotPasswordJSPController {
	
	@GetMapping("/forgotpassword/")
    public String showRegistrationForm() {
        return "ForgetPassword"; // JSP file name would be "Register.jsp"
    }
}
