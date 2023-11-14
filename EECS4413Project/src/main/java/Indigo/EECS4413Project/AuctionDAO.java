package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class AuctionDAO {

	@Autowired
	HttpSession session;

	@Autowired
	ItemDAO itemDAO;
	
	@Autowired
	Auction auction;
	
	@Autowired
	Item item;
	
	public Auction start() {

		User bidder = new User();
		bidder.setEmail("abc@gmail");
		bidder.setCity("xyz");
		bidder.setPassword("1234");
		bidder.setUsername("abc");
		bidder.setfName("a");
		bidder.setlName("b");
		bidder.setStreetNumber("13");
		bidder.setStreetName("def");
		bidder.setCountry("f");
		bidder.setID(0);
		String itemName = (String) session.getAttribute("itemName");
		item = itemDAO.getItemByName(itemName);
		auction.setBidder(bidder);
		if(item.getAuctionType().equals("Dutch Auction")) {
			auction = new DutchAuctionDAO();	
		}
		else {
			auction = new ForwardAuctionDAO();
		}
		auction.setItem(item);
		return auction;

	}
	


}
