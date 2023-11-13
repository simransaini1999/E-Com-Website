package Indigo.EECS4413Project;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ItemDAO  {
	Auction auction;
	Item item;

	@Autowired
	ItemRepository itemrepo;
	public List<Item> readAll(){
		return itemrepo.findAll();
	}
	public Item read(String itemName) {
		return itemrepo.findByItemName(itemName);
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
	public void remove(String itemName) {
		itemrepo.deleteByItemName(itemName);
	}


}
