package com.auction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.User;

import jakarta.servlet.http.HttpSession;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@RestController
@RequestMapping("/item")
public class ItemController  {

	@Autowired
	private ItemDAO itemDAO = new ItemDAO(); 

	@PostMapping("/createitem")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void createItem(@RequestBody Item item) {
		itemDAO.create(item);
	}

	@DeleteMapping("/removeitem")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public void removeItem(@RequestParam String itemName) {
		itemDAO.remove(itemName);
	}

	@GetMapping("/allitems")
    @Produces(MediaType.APPLICATION_JSON)
	public List<Item> getreadAll(){
		return itemDAO.readAll(); 
	}

	@GetMapping
    @Produces(MediaType.APPLICATION_JSON)
	public Item getitem(@RequestParam String itemName,HttpSession session) {
		session.setAttribute("ItemName", itemName);
		return itemDAO.read(itemName);
	}


}
