package Indigo.EECS4413Project;



import jakarta.persistence.Access;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="users")
public class User {
	
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String username;
	@Column
	private String fName;
	@Column
	private String lName;
	@Column
	private String streetNumber;
	@Column
	private String streetName;
	@Column
	private String postalCode;
	@Column
	private String city;
	@Column
	private String country;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

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
		return streetName;
	}
	public void setStreedName(String streedName) {
		this.streetName = streedName;
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
	public Long getID() {
		return ID;
	}

}