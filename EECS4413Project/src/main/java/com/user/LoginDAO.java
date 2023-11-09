package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connection.DatabaseConnection;

public class LoginDAO extends User{



	public List<User> readAll(){
		String query = "SELECT * FROM users";
		List<User> users = new ArrayList<>();

		try(Connection conn = DatabaseConnection.connect()){
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				User user = new User();
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				user.setUsername(resultSet.getString("username"));
				user.setfName(resultSet.getString("fName"));
				user.setlName(resultSet.getString("lName"));
				user.setStreetNumber(resultSet.getString("streetNumber"));
				user.setStreedName(resultSet.getString("streedName"));
				user.setPostalCode(resultSet.getString("postalCode"));
				user.setCity(resultSet.getString("city"));
				user.setCountry(resultSet.getString("country"));
			}


		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;

	}


	public boolean read(String username, String password){ // getting the username and password from front end form and authenticating
		String query = "SELECT password FROM users WHERE username = ?";
		List<User> users = new ArrayList<>();

		boolean result = false;
		try(Connection conn = DatabaseConnection.connect()){
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1,username);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();

			if(resultSet.getString(1).equals(password)) {
				result  = true;
			}else {
				result = false;
			}


		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;

	}

	public void update(String username, String password) {
		String query = "UPDATE users SET password = ? WHERE username = ?";
		List<User> users = new ArrayList<>();
		try(Connection conn = DatabaseConnection.connect()){
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1,password);
			preparedStatement.setString(2, username);
			preparedStatement.executeUpdate();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

