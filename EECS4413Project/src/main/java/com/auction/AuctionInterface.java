package com.auction;

import com.user.User;

public interface AuctionInterface {
	
	public void changePrice(int price);
	public void setBidder(User user);
	public User getBidder();
	
}
