package Indigo.EECS4413Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class PaymentDAO {

	public List<User> readAll(){
		String query = "SELECT * FROM users";
		List<User> users = new ArrayList<>();

		try(Connection conn = DatabaseConnection.connect()){
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				User user = new User();
				user.setEmail(resultSet.getString("email"));
				user.setUsername(resultSet.getString("username"));
				user.setfName(resultSet.getString("fName"));
				user.setlName(resultSet.getString("lName"));
				user.setStreetNumber(resultSet.getString("streetNumber"));
				user.setStreedName(resultSet.getString("streedName"));
				user.setPostalCode(resultSet.getString("postalCode"));
				user.setCity(resultSet.getString("city"));
				user.setCountry(resultSet.getString("country"));
				users.add(user);
			}


		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return users;

	}

}
