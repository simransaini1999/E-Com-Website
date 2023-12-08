package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemCatalogueJSPController {
	@GetMapping("/cataloguejsp/")
    public String showRegistrationForm() {
        return "ItemCatalog"; // JSP file name would be "Register.jsp"
    }
}
