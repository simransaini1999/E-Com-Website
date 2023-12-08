package Indigo.EECS4413Project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="history")
public class History {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ID;
	
	@Column(name = "bidderID")
	int bidderID;
	
	@Column(name = "bidAmount")
	int bidAmount;
	public int getBidderID() {
		return bidderID;
	}
	public void setBidderID(int bidderID) {
		this.bidderID = bidderID;
	}
	public int getBidAmount() {
		return bidAmount;
	}
	public void setBidAmount(int bidAmount) {
		this.bidAmount = bidAmount;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
}
