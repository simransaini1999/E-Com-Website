package com.auction;

public class Item extends Auction{

	private String itemName;
	private String itemDescription;
	private String auctionType;
	private int currentPrice;
	private int shipmentPrice;


	public String getItemName() {
		return itemName;
	}


	public String getItemDescription() {
		return itemDescription;
	}
	public String getAuctionType() {
		return auctionType;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public double getShipmentPrice() {
		return shipmentPrice;
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
	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
	}
	public void setShipmentPrice(int shipmentPrice) {
		this.shipmentPrice = shipmentPrice;
	}



}
