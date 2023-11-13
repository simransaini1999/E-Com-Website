package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.core.MediaType;


@RestController
@RequestMapping("/auction")
public class AuctionController {
	@Autowired
	private AuctionDAO auctionDAO = new AuctionDAO(); 

	@GetMapping(value = "/start",produces = MediaType.APPLICATION_JSON)
	@ResponseBody
	public Auction startauction() {
		Auction auction = auctionDAO.start();
		System.out.println(auction.getItem().getItemName());
		return auction;
		
	}
}
