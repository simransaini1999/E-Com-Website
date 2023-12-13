package Indigo.EECS4413Project.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Indigo.EECS4413Project.model.History;
import Indigo.EECS4413Project.model.Item;
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
	
	@Autowired
	HistoryDAO historyDAO;
	
	
 	
	public Item itemDetails() {

		
		String itemName = (String) session.getAttribute("itemName");
		Item item = itemDAO.getItemByName(itemName);
	
		return item;

	}
	
	//Add for several products later using hashmap
	public void settingDutchBid(int bidAmount) {
		context.setAttribute("highestDutchBidder", session.getAttribute("ID"));
		System.out.println("Dutch bidder is "+session.getAttribute("ID"));
		System.out.println("Dutch bidder context is "+context.getAttribute("highestDutchBidder"));
		context.setAttribute("dutchBidAmount", bidAmount);
	}
	
	public void settingForwardBid(int bidAmount) {
	    // History history = new History(); // Remove this line

	    if (context.getAttribute("forwardBidAmount") == null) {
	        context.setAttribute("highestForwardBidder", session.getAttribute("ID"));
	        context.setAttribute("forwardBidAmount", bidAmount);

	        History history = new History();
	        history.setBidderID((int) context.getAttribute("highestForwardBidder"));
	        history.setBidAmount((int) context.getAttribute("forwardBidAmount"));
	        historyDAO.create(history);

	        System.out.println(context.getAttribute("highestForwardBidder"));
	    } else if (bidAmount > (int) context.getAttribute("forwardBidAmount")) {
	        System.out.println("Old bid amount is: " + context.getAttribute("forwardBidAmount"));
	        context.setAttribute("highestForwardBidder", session.getAttribute("ID"));
	        context.setAttribute("forwardBidAmount", bidAmount);

	        History history = new History();
	        history.setBidderID((int) context.getAttribute("highestForwardBidder"));
	        history.setBidAmount((int) context.getAttribute("forwardBidAmount"));
	        historyDAO.create(history);

	        System.out.println("New bid amount was: " + bidAmount);
	        System.out.println(context.getAttribute("highestForwardBidder"));
	    } else {
	        System.out.println("ERROR: Bid amount not greater than current bid!");
	    }
	}
	
//	public int forwardTimer() {
//		int counter = 61;
//		
//		while(counter > 0) {
//			counter = counter-1;
//			try {
//				
//				Thread.sleep(1000);
//				return counter;
//				
//				
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//			
//		}
//		itemDAO.remove((String)context.getAttribute("itemName"));
//		return 0;
//
//	}

	
	public int getHighestBidderAndBid(){
		
		if(context.getAttribute("highestForwardBidder") == null) {
			return 0;
			
		}
		return (int) context.getAttribute("highestForwardBidder");
	}
	
	public int getHighestBidder(){
			System.out.println("HELLO");
			if(context.getAttribute("highestDutchBidder") == null) {
				System.out.println("Dutch bidder context22222 is "+context.getAttribute("highestDutchBidder"));
				return 0;
				
			}
			System.out.println("Dutch bidder context34242 is "+context.getAttribute("highestDutchBidder"));
	
			return (int) context.getAttribute("highestDutchBidder");
		}
	
	

}
