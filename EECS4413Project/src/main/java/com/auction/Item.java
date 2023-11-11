package com.auction;

public class Item extends Auction{

	private int itemID;
	private String itemName;
	private String itemDescription;
	private String auctionType;
	private int startingBidPrice;
	private int shipmentPrice;


	public int getItemID() {
		return itemID;
	}
	public String getItemName() {
		return itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}
	public String getAuctionType() {
		return auctionType;
	}
	public int getStartingBidPrice() {
		return startingBidPrice;
	}
	public int getShipmentPrice() {
		return shipmentPrice;
	}
	public void setItemID(int id) {
		this.itemID = id;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public void setAuctionType(String auctionType) {
		this.auctionType = auctionType;
	}
	public void setStartingBidPrice(int currentPrice) {
		this.startingBidPrice = currentPrice;
	}
	public void setShipmentPrice(int shipmentPrice) {
		this.shipmentPrice = shipmentPrice;
	}



}
