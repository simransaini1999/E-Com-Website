package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@Autowired
	private Auction auction;
	
	@Autowired
	private DutchAuctionDAO dutchAuctionDAO;

	@GetMapping(value = "/start",produces = MediaType.APPLICATION_JSON)
	@ResponseBody
	public Auction startauction() {
		auction = auctionDAO.start();
		System.out.println(auction.getItem().getItemName());
		return auction;
	}
	
	@PostMapping(value = "/dutchauction/winner/{bidamount}", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
	public void doDutchAuction(@RequestBody User user,@PathVariable int bidAmount) {
		if(auction.getBidder().getID() == user.getID()) {
			dutchAuctionDAO.settingBidingUserAndAmount(user, bidAmount);
		}
	}
	
	
}
