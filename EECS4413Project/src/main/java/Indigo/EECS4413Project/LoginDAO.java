package Indigo.EECS4413Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class LoginDAO extends User{
	@Autowired
	UserRepository userrepo;


	public boolean read(String username, String password){ // getting the username and password from front end form and authenticating


		boolean result;
		String dbPass = userrepo.findbyUsername(username);
		if(dbPass.equals(password)) {
			result  = true;
		}else {
			result = false;
		}

		return result;

	}

	public void update(String username, String password) {
//		String query = "UPDATE users SET password = ? WHERE username = ?";
//
//		try(Connection conn = DatabaseConnection.connect()){
//			PreparedStatement preparedStatement = conn.prepareStatement(query);
//			preparedStatement.setString(1,password);
//			preparedStatement.setString(2, username);
//			preparedStatement.executeUpdate();
//		}
//		catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}
		userrepo.update(username,password); 
	}
}

