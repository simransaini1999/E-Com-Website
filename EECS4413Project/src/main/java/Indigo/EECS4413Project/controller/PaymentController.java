package Indigo.EECS4413Project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Indigo.EECS4413Project.logic.PaymentDAO;
import Indigo.EECS4413Project.model.Item;
import Indigo.EECS4413Project.model.User;


@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentDAO paymentDAO; 

	@GetMapping("/forwardauction")
	public String forwardPayment(){
		Item item = paymentDAO.getItem();
		int price = paymentDAO.getForwardBidPrice();
		User user = paymentDAO.getForwardUser();
		
		return "Item : " + item.getItemName() + "\nprice : " + price + "\nuser : " + user.getUsername()+ "\nForward Auction Item";
	}
	
	@GetMapping("/dutchauction")
	public String dutchPayment(){
		Item item = paymentDAO.getItem();
		int price = paymentDAO.getForwardBidPrice();
		User user = paymentDAO.getForwardUser();
		
		return "Item : " + item.getItemName() + "\nprice : " + price + "\nuser : " + user.getUsername() + "\nDutch Auction Item";
	}

}
