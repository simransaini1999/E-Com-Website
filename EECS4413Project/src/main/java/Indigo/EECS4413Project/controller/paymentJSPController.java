package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paymentjsp")
public class paymentJSPController {

	@GetMapping("/")
    public String showRegistrationForm() {
        return "Payment"; // JSP file name would be "Register.jsp"
    }
}
