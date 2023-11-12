package com.auction;

import com.user.User;

public interface AuctionInterface {
	
	public void settingBid(User user, int price);
	public User getBidder();
	
}
