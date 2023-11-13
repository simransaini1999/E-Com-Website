package Indigo.EECS4413Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.ws.rs.core.MediaType;


@RestController
@RequestMapping("/seller")
public class SellerController {

	@Autowired
	private ItemDAO itemDAO = new ItemDAO();

	@PostMapping(value = "/createitem",consumes = MediaType.APPLICATION_JSON,produces = MediaType.APPLICATION_JSON)
	public void createItem(@RequestBody Item item) {
		itemDAO.create(item);
	}
}
