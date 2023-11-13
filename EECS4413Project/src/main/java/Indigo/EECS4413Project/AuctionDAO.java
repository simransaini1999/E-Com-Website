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
	public Auction start() {


		String itemName = (String) session.getAttribute("itemName");
		Item item = itemDAO.getItemByName(itemName);

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
