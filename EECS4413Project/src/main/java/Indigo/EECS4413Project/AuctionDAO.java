package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import jakarta.inject.Qualifier;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;

@Service
public class AuctionDAO {


	@Autowired
	HttpSession session;

	@Autowired
	ItemDAO itemDAO;
	
	@Autowired
	ServletContext context;
 	

	
	
	public Item itemDetails() {

		
		String itemName = (String) session.getAttribute("itemName");
		Item item = itemDAO.getItemByName(itemName);
	
		return item;

	}
	
	//Add for several products later using hashmap
	public String settingDutchBid(int id, int bidAmount) {
		context.setAttribute("highestDutchBidder", id);
		context.setAttribute("dutchBidAmount", bidAmount);
		return "bid submitted";
	}
	
	
	public String settingForwardBid(int id, int bidAmount) {
		if(context.getAttribute("forwardBidAmount") == null) {
			context.setAttribute("highestForwardBidder", id);
			context.setAttribute("forwardBidAmount", bidAmount);
		
		}
		else if(bidAmount > (int) context.getAttribute("forwardBidAmount")) {
		context.setAttribute("highestForwardBidder", id);
		context.setAttribute("forwardBidAmount", bidAmount);
		}
		else {
			return "error";
		}
		return "bid submitted";
	}

	
		
	
	


}
