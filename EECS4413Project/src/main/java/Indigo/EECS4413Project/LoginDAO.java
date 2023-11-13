package Indigo.EECS4413Project;



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
		userrepo.update(username,password); 
	}
}

