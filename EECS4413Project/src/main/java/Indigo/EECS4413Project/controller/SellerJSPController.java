package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sellerjsp")
public class SellerJSPController {

	@GetMapping("/")
    public String showRegistrationForm() {
        return "Seller"; // JSP file name would be "Register.jsp"
    }
}
