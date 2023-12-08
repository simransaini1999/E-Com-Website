package Indigo.EECS4413Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Indigo.EECS4413Project.logic.AuctionDAO;
import Indigo.EECS4413Project.model.Item;
import jakarta.ws.rs.core.MediaType;


@RestController
@RequestMapping("/auction")
public class AuctionController {
	@Autowired
	private AuctionDAO auctionDAO; 

	@GetMapping(value = "/itemdetails",produces = MediaType.APPLICATION_JSON)
	@ResponseBody
	public Item startauction() {
		return auctionDAO.itemDetails();
	}
	
	@PostMapping(value = "/dutchauction/{id}/{bidAmount}", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
	public String doDutchAuction(@PathVariable int id,@PathVariable int bidAmount) {
			return auctionDAO.settingDutchBid(id, bidAmount);
	}
	
	@PostMapping(value = "/forwardauction/{id}/{bidAmount}", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
	public String doForwardAuction(@PathVariable int id,@PathVariable int bidAmount) {
			return auctionDAO.settingForwardBid(id, bidAmount);
	}

	
	
	
	
	
}
