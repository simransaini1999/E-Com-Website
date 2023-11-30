package Indigo.EECS4413Project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class SignupDAO extends User {
	@Autowired
	UserRepository userrepo;

	public void create(User user) {

		User user1 = new User();
		user1.setID(user.getID());
		user1.setCity(user.getCity());
		user1.setCountry(user.getCountry());
		user1.setEmail(user.getEmail());
		user1.setfName(user.getfName());
		user1.setlName(user.getlName());
		user1.setPostalCode(user.getPostalCode());
		user1.setStreetName(user.getStreetName());
		user1.setStreetNumber(user.getStreetNumber());
		user1.setUsername(user.getUsername());

		userrepo.save(user1);
		
	} 
}



