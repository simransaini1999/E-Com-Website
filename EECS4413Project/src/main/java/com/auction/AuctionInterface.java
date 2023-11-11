package com.auction;

import com.user.User;

public interface AuctionInterface {
	
	public void changePrice(int price);
	public void settingBid(User user, int price);
	public User getBidder();
	
}
