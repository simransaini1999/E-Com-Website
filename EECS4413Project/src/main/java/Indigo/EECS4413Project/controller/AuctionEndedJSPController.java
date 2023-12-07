package Indigo.EECS4413Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuctionEndedJSPController {

	@GetMapping("/auctionendedjsp/")
    public String showRegistrationForm() {
        return "AuctionEnded"; // JSP file name would be "Register.jsp"
    }
}
