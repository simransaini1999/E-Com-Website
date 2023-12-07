package Indigo.EECS4413Project.logic;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Indigo.EECS4413Project.model.Item;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;

@Service
public class AuctionDAO {


	@Autowired
	HttpSession session;

	@Autowired
	ItemDAO itemDAO;
	
	@Autowired
	ServletContext context;
 	
	public Item itemDetails() {

		
		String itemName = (String) session.getAttribute("itemName");
		Item item = itemDAO.getItemByName(itemName);
	
		return item;

	}
	
	//Add for several products later using hashmap
	public void settingDutchBid(int bidAmount) {
		context.setAttribute("highestDutchBidder", session.getAttribute("ID"));
		context.setAttribute("dutchBidAmount", bidAmount);
	}
	
	public void settingForwardBid(int bidAmount) {
		if(context.getAttribute("forwardBidAmount") == null) {
			context.setAttribute("highestForwardBidder", session.getAttribute("ID"));
			context.setAttribute("forwardBidAmount", bidAmount);	
		}
		else if(bidAmount > (int) context.getAttribute("forwardBidAmount")) {
		context.setAttribute("highestForwardBidder", session.getAttribute("ID"));
		context.setAttribute("forwardBidAmount", bidAmount);
		}
		else {
			System.out.println("ERROR!!!");
			}

	}
	
	public ArrayList<Integer> getHighestBidderAndBid(){
		ArrayList<Integer> array = new ArrayList<Integer>();
		if(context.getAttribute("ID") == null) {
			array.add(0);
			System.out.println("DOne1");
		}else {
		array.add((int) context.getAttribute("highestForwardBidder"));
		System.out.println("DOne1");
		array.add((int) context.getAttribute("forwardBidAmount"));
		System.out.println("Done2");
	}
		return array;
	}
	
	

}
