package Indigo.EECS4413Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PaymentDAO {
	@Autowired
	UserRepository userrepo;

	public User read(int id){
		return userrepo.findByID(id);

	}

}
