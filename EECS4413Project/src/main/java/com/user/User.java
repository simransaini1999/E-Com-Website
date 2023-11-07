package com.user;

import java.util.concurrent.atomic.AtomicInteger;

public class User {
	private String email;
	private String password;
	private String username;
	private String fName;
	private String lName;
	private String streetNumber;
	private String streedName;
	private String postalCode;
	private String city;
	private String country;
	private AtomicInteger ID;
	
	public User() {}
//	public User(String email, String password, String username, String fName, String lName, String streetNumber,
//			String streedName, String postalCode, String city, String country) {
//		super();
//		this.email = email;
//		this.password = password;
//		this.username = username;
//		this.fName = fName;
//		this.lName = lName;
//		this.streetNumber = streetNumber;
//		this.streedName = streedName;
//		this.postalCode = postalCode;
//		this.city = city;
//		this.country = country;
//	} 
//	
//	
//	public User(String username, String password) {
//		this.username = username;
//		this.password = password;
//	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreedName() {
		return streedName;
	}
	public void setStreedName(String streedName) {
		this.streedName = streedName;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public AtomicInteger getID() {
		return ID;
	}
	public void setID() {
		ID.incrementAndGet();
	}
	
}
