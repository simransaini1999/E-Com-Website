package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itemjsp")
public class ItemSearchJSPController {

	@GetMapping("/")
    public String showRegistrationForm() {
        return "ItemSearch"; // JSP file name would be "Register.jsp"
    }
	
}
