package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HistoryJSPController {

	@GetMapping("/history/")
    public String showRegistrationForm() {
        return "History"; // JSP file name would be "Register.jsp"
    }
}
