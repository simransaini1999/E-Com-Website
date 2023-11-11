package com.auction;

import com.user.User;

public class ForwardAuctionDAO extends Auction implements AuctionInterface{
	this.setprice(100);


	public void settingBid(User user, int price) {
		if (price > this.getPrice()) {
			this.setBidder(user); 
		}
	}


}


}