package Indigo.EECS4413Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class Data {
	private String user;
	private String password;
	private String url;
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public void setURL(String url) {
		this.url = url;
	}
	
//	public void setup() {
//
//		try {
//			Connection con = DriverManager.getConnection(url, user, password);
//		}catch(Exception e) {
//			e.getMessage();
//		}
//	}
}
