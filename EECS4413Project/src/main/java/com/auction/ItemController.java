package com.auction;

import java.util.List;
import com.user.User;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/item")
public class ItemController  {
	private ItemDAO itemDAO = new ItemDAO(); 
	
	@Path("/createitem")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void createItem(Item item) {
	itemDAO.create(item);
	}

	
	@Path("/removeitem")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void removeItem(String itemName) {
	itemDAO.remove(itemName);
	}
	
	@Path("/allitems")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item> getreadAll(){
		return itemDAO.readAll(); 
	}
	
	@GET 
	@Path("/itemname")
	@Produces(MediaType.APPLICATION_JSON)
	public Item getitem(String itemName) {
		return itemDAO.read(itemName);
	}
	
}
