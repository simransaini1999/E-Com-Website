package Indigo.EECS4413Project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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