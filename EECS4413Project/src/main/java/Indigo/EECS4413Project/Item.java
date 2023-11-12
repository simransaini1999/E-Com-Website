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
	@Column
	private String itemName;
	@Column
	private String itemDescription;
	@Column
	private String auctionType;
	@Column
	private int startingBidPrice;
	@Column
	private int shipmentPrice;


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



}
