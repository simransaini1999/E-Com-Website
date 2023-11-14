package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
//import javax.annotation.Resource;

public class Signup extends User {

//	public Signup(String email, String password, String username, String fName, String lName, String streetNumber,
//			String streedName, String postalCode, String city, String country) {
//		super(email, password, username, fName, lName, streetNumber, streedName, postalCode, city, country);	
//	}
	
	//@Resource(name = "jdbc/Database_Name")
	private DataSource dataSource;
	
	public Signup() {
		super();
	}

	private static List<User> users = new ArrayList<User>();
	
	public void create(String email, String password, String username, String fName, String lName, String streetNumber,	String streetName, String postalCode, String city, String country) {
		try(Connection con = dataSource.getConnection()) {
			User user = new User();
			user.setCity(city);
			user.setCountry(country);
			user.setEmail(email);
			user.setfName(fName);
			user.setlName(lName);
			user.setPostalCode(postalCode);
			user.setStreedName(streetName);
			user.setStreetNumber(streetNumber);
			user.setID();
			user.setUsername(username);
			if(!(user.getUsername().equals(password))) {
				user.setPassword(password);
			}
			else {
				System.out.println("Password cannot match username!!!");
				//System is supposed to exit here.
			}
			String query1 = "insert into userInfo (ID, fName, lName, email, streetNumber, streetName, postalCode, city, country) values (?,?,?,?,?,?,?,?,?)"; 
			PreparedStatement  ps1 = con.prepareStatement(query1);
			ps1.setInt(1,user.getID().intValue());
			ps1.setString(2,fName);
			ps1.setString(3,lName);
			ps1.setString(4,email);
			ps1.setString(5, streetNumber);
			ps1.setString(6, streetName);
			ps1.setString(7, postalCode);
			ps1.setString(8, city);
			ps1.setString(9, country);
			ps1.execute();
			
			String query2 = "insert into loginInfo (ID, username, password)";
			PreparedStatement ps2 = con.prepareStatement(query2);
			ps2.setInt(1,user.getID().intValue());
			ps2.setString(2, username);
			ps2.setString(3, password);
			ps2.execute();
			
			users.add(user);
		} catch (SQLException e) {
			System.out.println("Error in user/login database");
		}
	}
	
//	public DataSource createConnection() {
//		DataSource dataSource = new DataSource();
//		dataSource.setURL("jdbc:mysql://localhost:3306/myDatabase");
//        dataSource.setUser("root");
//        dataSource.setPassword("s3cr3t");
//        return dataSource;
//	}
	
	
	
	
}
