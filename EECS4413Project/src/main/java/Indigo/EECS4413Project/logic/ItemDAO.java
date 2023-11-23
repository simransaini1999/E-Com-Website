package Indigo.EECS4413Project.logic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Indigo.EECS4413Project.model.Item;
import jakarta.servlet.http.HttpSession;

//a
@Service
public class ItemDAO  {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	ItemRepository itemrepo;
	
	public List<Item> readAll(){
		return itemrepo.findAll();
	}
	
	public void selectItem(String itemName) {
		session.setAttribute("itemName", itemName);
		
	}
	public void create(Item item) {
		Item item1 = new Item();
		item1.setItemName(item.getItemName());
		item1.setItemDescription(item.getItemDescription());
		item1.setAuctionType(item.getAuctionType());
		item1.setStartingBidPrice(item.getStartingBidPrice());
		item1.setShipmentPrice(item.getShipmentPrice());
		item1.setExpeditedShipmentPrice(item.getExpeditedShipmentPrice());

		itemrepo.save(item1);

	}
	public Item getItemByName(String itemName) {
		return itemrepo.findByItemName(itemName);
	}
	public void remove(String itemName) {
		itemrepo.deleteByItemName(itemName);
	}


}
