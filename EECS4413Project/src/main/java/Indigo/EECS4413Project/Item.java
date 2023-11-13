package Indigo.EECS4413Project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="items")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	@Column(name = "itemName")
	private String itemName;
	
	@Column(name = "itemDescription")
	private String itemDescription;
	
	@Column(name = "auctionType")
	private String auctionType;
	
	@Column(name = "startingBidPrice")
	private int startingBidPrice;
	
	@Column(name = "shipmentPrice")
	private int shipmentPrice;
	
	@Column(name = "expeditedShipmentPrice")
	private int expeditedShipmentPrice;


	public int getItemID() {
		return ID;
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
		this.ID = id;
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
	public int getExpeditedShipmentPrice() {
		return expeditedShipmentPrice;
	}
	public void setExpeditedShipmentPrice(int expeditedShipmentPrice) {
		this.expeditedShipmentPrice = expeditedShipmentPrice;
	}



}
