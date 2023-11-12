package com.auction;

import jakarta.servlet.http.HttpSession;

public class AuctionDAO {
	
	Auction auction;
	public Auction start(HttpSession session) {
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

}
