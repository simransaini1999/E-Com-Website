package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReceiptJSPController {
	@GetMapping("/receipt/")
    public String showRegistrationForm() {
        return "Receipt"; // JSP file name would be "Register.jsp"
    }
	
}
