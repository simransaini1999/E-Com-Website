package com.auction;

import java.util.ArrayList;

import com.user.User;

public class DutchAuctionDAO extends Auction implements AuctionInterface{

	private Item item;

	public DutchAuctionDAO() {
		this.item = new Item();
	}

	public void addItem(Item item) {
		this.item = item;
	}

	public void startDutchAuction(int itemIndex, int startingPrice, int decrementAmount, int reservePrice) {

		Item item = this.getItem();
		int currentPrice = startingPrice;

		while (currentPrice >= reservePrice) {
			System.out.println("Current Price: " + currentPrice);
			try {

				Thread.sleep(10000); // Sleep for 10 second (for example)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			currentPrice -= decrementAmount;
		}

		System.out.println("Auction ended. Item sold at " + reservePrice); 

	}
	public void settingBid(User user, int bidAmount) {
		this.setBidder(user);
		this.setPrice(bidAmount);

	}

}



