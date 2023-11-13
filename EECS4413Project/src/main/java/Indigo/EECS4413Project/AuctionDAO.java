package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.servlet.http.HttpSession;

@Repository
public class AuctionDAO {

	@Autowired
	HttpSession session;

	Auction auction;
	public Auction start() {

		ItemDAO itemDAO = new ItemDAO();

		String itemName = (String) session.getAttribute("ItemName");
		Item item = itemDAO.read(itemName);

		if(item.getAuctionType().equals("Dutch Auction")) {
			auction = new DutchAuctionDAO();	
		}
		else {
			auction = new ForwardAuctionDAO();
		}
		auction.setItem(item);
		return auction;

	}
	
//	public void endAuction(Auction auction) {
//        
//        auction.processPayment(auction.getItem(), auction.getBidder().getUsername(), auction.getItem() ,auction.getPrice());
//    }

}
