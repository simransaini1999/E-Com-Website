package Indigo.EECS4413Project;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.core.MediaType;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemDAO itemDAO; 

	@PostMapping(value = "/createitem",consumes = MediaType.APPLICATION_JSON,produces = MediaType.APPLICATION_JSON)
	public void createItem(@RequestBody Item item) {
		itemDAO.create(item);
	}

	@DeleteMapping("/removeitem")
	public void removeItem(@RequestParam String itemName) {
		itemDAO.remove(itemName);
	}

	@GetMapping(value = "/allitems",produces = MediaType.APPLICATION_JSON)
	public List<Item> getReadAll() {
		return itemDAO.readAll();
	}

	@GetMapping("/getitem")
	public Item getItem(@RequestParam String itemName, HttpSession session) {
		session.setAttribute("ItemName", itemName);
		return itemDAO.read(itemName);
	}
}

