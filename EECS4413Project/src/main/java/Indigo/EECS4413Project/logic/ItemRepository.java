package Indigo.EECS4413Project.logic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Indigo.EECS4413Project.model.Item;

@Repository
public interface ItemRepository extends JpaRepository <Item, Integer> {
	
	@Query(value = "SELECT * FROM items WHERE item_Name = ?1", nativeQuery = true)
	Item findByItemName(String itemName);
	
	@Modifying
	@Query(value = "DELETE FROM items WHERE item_Name = ?1", nativeQuery = true)
	void deleteByItemName(String itemName);
}
