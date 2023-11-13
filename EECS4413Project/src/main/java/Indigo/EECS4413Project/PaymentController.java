package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentDAO paymentDAO = new PaymentDAO(); 

	@GetMapping("/{id}")
	public User getAllUsers(@PathVariable int id){
		return paymentDAO.read(id); 
	}

}
