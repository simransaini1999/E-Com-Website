package Indigo.EECS4413Project.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Indigo.EECS4413Project.model.History;
import Indigo.EECS4413Project.model.Item;
import jakarta.servlet.http.HttpSession;

@Service
public class HistoryDAO {
	@Autowired
	HttpSession session;
	
	@Autowired
	HistoryRepository historyrepo;
	
	public List<History> readAll(){
		return historyrepo.findAll();
	}
	
	public void create(History history) {
		History history1 = new History();
		history1.setBidderID(history.getBidderID());
		history1.setBidAmount(history.getBidAmount());
		
		historyrepo.save(history1);

	}
	
	
}
