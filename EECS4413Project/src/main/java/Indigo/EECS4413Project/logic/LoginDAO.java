package Indigo.EECS4413Project.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Indigo.EECS4413Project.model.User;
import jakarta.servlet.http.HttpSession;
@Repository
public class LoginDAO{
	@Autowired
	UserRepository userrepo;
	
	@Autowired
	HttpSession session;

	public boolean read(String username, String password){ // getting the username and password from front end form and authenticating
		boolean result;
		String dbPass = userrepo.findbyUsername(username);
		int ID = userrepo.findID(username, password);
		session.setAttribute("ID", ID);
		System.out.println(ID);
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

