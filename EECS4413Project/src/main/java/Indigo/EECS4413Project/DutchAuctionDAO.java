package Indigo.EECS4413Project;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
@Repository
public class DutchAuctionDAO extends Auction implements AuctionInterface{
	
	@Autowired
	Auction auction;
	
	@Autowired
	HttpSession session;

	@Autowired
	ServletContext context;
	
	boolean itemPurchased = false;



	public void priceDecrementer(int decrementAmount, int sellerPrice) {

		
			System.out.println("Current Price: " + auction.getPrice());

			auction.setPrice(auction.getPrice() - decrementAmount);
		}

	

	
	public void settingBidingUserAndAmount(User user, int bidAmount) {
		context.setAttribute("highestBidder", user);
		context.setAttribute("bidAmount", bidAmount);
	}
	
	
	public void purchaseItem() {
		itemPurchased = true;
	}
	
	public void doAuction(int decrementValue, int sellerPrice) {
		
	}
	

}



