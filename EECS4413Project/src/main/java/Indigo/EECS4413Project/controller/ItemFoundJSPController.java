package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/itemfoundjsp")
public class ItemFoundJSPController {

	@GetMapping("/")
    public String showRegistrationForm() {
        return "ItemFound"; // JSP file name would be "Register.jsp"
    }
	
}
