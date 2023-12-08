package Indigo.EECS4413Project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Indigo.EECS4413Project.logic.HistoryDAO;
import Indigo.EECS4413Project.logic.PaymentDAO;
import Indigo.EECS4413Project.model.History;
import Indigo.EECS4413Project.model.Item;
import Indigo.EECS4413Project.model.User;


@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentDAO paymentDAO; 
	
	@Autowired
	HistoryDAO historyDAO;

	@GetMapping("/user/{auctionType}")
	public User Payment(@PathVariable String auctionType){
		
		if(auctionType.equals("Forward Auction")) {
			return paymentDAO.getForwardUser();
		}
		return paymentDAO.getDutchUser();
		
	}
	
	@GetMapping("/checkBidder/{auctionType}")
	public boolean checkBidderID(@PathVariable String auctionType) {
		return paymentDAO.authenticateBidder(auctionType);
	}
	
	@GetMapping("/gethistory")
	public List<History> getAllHistory(){
		return historyDAO.readAll();
	}

}
