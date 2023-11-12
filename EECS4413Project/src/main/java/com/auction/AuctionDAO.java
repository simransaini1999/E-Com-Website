package com.auction;

public class AuctionDAO {
	
	Auction auction;
	
	public Auction create(Item item) {
		
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
