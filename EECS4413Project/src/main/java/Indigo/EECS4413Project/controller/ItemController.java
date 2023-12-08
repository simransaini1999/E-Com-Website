package Indigo.EECS4413Project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Indigo.EECS4413Project.logic.ItemDAO;
import Indigo.EECS4413Project.model.Item;
import jakarta.transaction.Transactional;
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

	@Transactional
	@DeleteMapping(value = "/removeitem/{itemName}",produces = MediaType.APPLICATION_JSON)
	public void removeItem(@PathVariable String itemName) {
		itemDAO.remove(itemName);
	}

	@GetMapping(value = "/allitems",produces = MediaType.APPLICATION_JSON)
	public List<Item> getReadAll() {
		return itemDAO.readAll();
	}

	@GetMapping(value = "/getitem/{itemName}",produces = MediaType.APPLICATION_JSON)
	public Item getItem(@PathVariable String itemName) {
		return itemDAO.getItemByName(itemName);
	}
	
	@PostMapping(value = "/selectitem/{itemName}", produces = MediaType.APPLICATION_JSON)
	public void chooseItem(@PathVariable String itemName) {
		itemDAO.selectItem(itemName);
	}
	
}

