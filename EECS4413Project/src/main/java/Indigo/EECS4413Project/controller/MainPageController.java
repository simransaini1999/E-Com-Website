package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainPageController {
	
	@RequestMapping("/")
	public String showRegistrationForm() {
        return "MainPage"; // JSP file name would be "Register.jsp"
    }

}
