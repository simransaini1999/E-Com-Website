package Indigo.EECS4413Project.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="users")
public class User {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int ID;

	    @Column(name = "email")
	    private String email;

	    @Column(name = "password")
	    private String password;

	    @Column(name = "username")
	    private String username;

	    @JsonProperty("fName") // Map to JSON property "fName"
	    @Column(name = "fName")
	    private String fName;

	    @JsonProperty("lName") // Map to JSON property "lName"
	    @Column(name = "lName")
	    private String lName;

	    @JsonProperty("streetNumber") // Map to JSON property "streetNumber"
	    @Column(name = "streetNumber")
	    private String streetNumber;

	    @JsonProperty("streetName") // Map to JSON property "streetName"
	    @Column(name = "streetName")
	    private String streetName;

	    @JsonProperty("postalCode") // Map to JSON property "postalCode"
	    @Column(name = "postalCode")
	    private String postalCode;

	    @JsonProperty("city") // Map to JSON property "city"
	    @Column(name = "city")
	    private String city;

	    @JsonProperty("country") // Map to JSON property "country"
	    @Column(name = "country")
	    private String country;
	
	

	public User() {}

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
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
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
	public int getID() {
		return ID;
	}
	public void setID(int Id) {
		this.ID=Id;
	}
	
}
