package Indigo.EECS4413Project.logic;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import Indigo.EECS4413Project.model.User;


@Service
public class SignupDAO extends User {
	@Autowired
	UserRepository userrepo;

	public void create(User user) {

		User user1 = new User();
		
		user1.setCity(user.getCity());
		user1.setCountry(user.getCountry());
		user1.setEmail(user.getEmail());
		user1.setfName(user.getfName());
		user1.setlName(user.getlName());
		user1.setPostalCode(user.getPostalCode());
		user1.setStreetName(user.getStreetName());
		user1.setStreetNumber(user.getStreetNumber());
		user1.setUsername(user.getUsername());
		user1.setPassword(user.getPassword());
		userrepo.save(user1);

		
	} 
}



