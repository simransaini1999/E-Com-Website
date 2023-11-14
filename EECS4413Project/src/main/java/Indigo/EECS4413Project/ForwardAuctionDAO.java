package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ForwardAuctionDAO extends Auction implements AuctionInterface {

	@Autowired
	Auction auction;
	public ForwardAuctionDAO() {
		auction.setPrice(100);
	}
	public void settingBid(User user, int bidAmount) {
		if (bidAmount > auction.getPrice()) {
			auction.setBidder(user); 
			this.changePrice(bidAmount);
		}
	}
	public void changePrice(int price) {
		auction.setPrice(price);
	}
	@Override
	public void settingBidingUserAndAmount(User user, int price) {
		// TODO Auto-generated method stub
		
	}
}
