package Indigo.EECS4413Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class SignupDAO extends User {
	UserRepository userrepo;

	public SignupDAO() {
		super();
	}

	private static List<User> users = new ArrayList<>();

	public void create(String email, String password, String username, String fName, String lName, String streetNumber,	String streetName, String postalCode, String city, String country) {
		try(Connection con = DatabaseConnection.connect()) {
			User user = new User();
			user.setCity(city);
			user.setCountry(country);
			user.setEmail(email);
			user.setfName(fName);
			user.setlName(lName);
			user.setPostalCode(postalCode);
			user.setStreedName(streetName);
			user.setStreetNumber(streetNumber);
			user.setUsername(username);
			if(!(user.getUsername().equals(password))) {
				user.setPassword(password);
			}
			else {
				System.out.println("Password cannot match username!!!");
				throw new SQLException();
			}
			String query1 = "insert into users (ID, fName, lName, email, streetNumber, streetName, postalCode, city, country) values (?,?,?,?,?,?,?,?,?)";
			PreparedStatement  ps1 = con.prepareStatement(query1);
			ps1.setString(2,fName);
			ps1.setString(3,lName);
			ps1.setString(4,email);
			ps1.setString(5, streetNumber);
			ps1.setString(6, streetName);
			ps1.setString(7, postalCode);
			ps1.setString(8, city);
			ps1.setString(9, country);
			ps1.setString(10, username);
			ps1.setString(11,password);
			ps1.execute();

			users.add(user);
		} catch (SQLException e) {
			System.out.println("Error in signupDAO");
		}
	}


}
