package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuctionJSPController {
	@GetMapping("/ForwardAuctionjsp/")
    public String showRegistrationForm() {
        return "ForwardAuction"; // JSP file name would be "Register.jsp"
    }
	@GetMapping("/DutchAuctionjsp/")
    public String showRegistrationForm2() {
        return "DutchAuction"; // JSP file name would be "Register.jsp"
    }
}
