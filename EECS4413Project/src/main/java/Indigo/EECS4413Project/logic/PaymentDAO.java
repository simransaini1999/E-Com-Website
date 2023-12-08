package Indigo.EECS4413Project.logic;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import Indigo.EECS4413Project.model.Item;
import Indigo.EECS4413Project.model.User;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;
@Service
public class PaymentDAO {

	@Autowired
	UserRepository userrepo;
	
	@Autowired
	ItemDAO itemDAO;
	
	@Autowired
	HttpSession session;
	
	@Autowired
	ServletContext context;

	
	public Item getItem() {
		Item item = itemDAO.getItemByName((String)session.getAttribute("itemName"));
		return item;
	}
	
	public User getDutchUser() {
		User user = userrepo.findByID( (int) context.getAttribute("highestDutchBidder"));
		return user;
	}
	public int getDutchBidPrice() {
		return (int) context.getAttribute("dutchBidAmount");
	}
	
	public User getForwardUser() {
		User user = userrepo.findByID( (int) context.getAttribute("highestForwardBidder"));
		return user;
	}
	public int getForwardBidPrice() {
		return (int) context.getAttribute("forwardBidAmount");
	}

	public boolean authenticateBidder(String auctionType) {
		
		if(auctionType.equals("Forward Auction") && session.getAttribute("ID") == context.getAttribute("highestForwardBidder")) {
			System.out.println("Session " +(int) session.getAttribute("ID"));
			System.out.println("Context " + (int)context.getAttribute("highestForwardBidder"));
			System.out.println("TRUE");
			return true;
		}else if(auctionType.equals("Dutch Auction") && session.getAttribute("ID") == context.getAttribute("highestDutchBidder")){
			
		}
		System.out.println("FALSE");
		return false;
	}
	
	
	
	
	
	

}
