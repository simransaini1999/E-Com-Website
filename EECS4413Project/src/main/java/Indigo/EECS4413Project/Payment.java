package Indigo.EECS4413Project;

public class Payment {

	int creditCarNumber;
	String nameOnCard;
	int expDate; 
	int securityCode;
	public int getCreditCarNumber() {
		return creditCarNumber;
	}
	
	public void setCreditCarNumber(int creditCarNumber) {
		this.creditCarNumber = creditCarNumber;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public void setExpDate(int expDate) {
		this.expDate = expDate;
	}
	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}
	
	
	
}
