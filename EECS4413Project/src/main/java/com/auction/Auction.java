package com.auction;
//random comment
//Random
import java.util.ArrayList;

import com.user.User;

//import com.user.User;

public class Auction {

	private int price;
	User bidder;
	private ArrayList<Item> items;
	private Item item;
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public int getPrice() {
		return price;
	}
	public User getBidder() {
		return bidder;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBidder(User bidder) {
		this.bidder = bidder;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}


}