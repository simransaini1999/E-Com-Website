package Indigo.EECS4413Project;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemDAO itemDAO; 

    @PostMapping("/createitem")
    public void createItem(@RequestBody Item item) {
        itemDAO.create(item);
    }

    @DeleteMapping("/removeitem")
    public void removeItem(@RequestParam String itemName) {
        itemDAO.remove(itemName);
    }

    @GetMapping("/allitems")
    public List<Item> getReadAll() {
        return itemDAO.readAll();
    }

    @GetMapping("/getitem")
    public Item getItem(@RequestParam String itemName, HttpSession session) {
        session.setAttribute("ItemName", itemName);
        return itemDAO.read(itemName);
    }
}

