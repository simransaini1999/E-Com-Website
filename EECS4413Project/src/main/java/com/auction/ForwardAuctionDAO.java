package com.auction;

import org.springframework.stereotype.Repository;

import com.user.User;
@Repository
public class ForwardAuctionDAO extends Auction implements AuctionInterface {

    public ForwardAuctionDAO() {
        this.setPrice(100);
    }

    public void settingBid(User user, int bidAmount) {
        if (bidAmount > this.getPrice()) {
            this.setBidder(user); 
            this.changePrice(bidAmount);
        }
    }
	public void changePrice(int price) {
		this.setPrice(price);
	}
}
