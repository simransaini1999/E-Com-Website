package Indigo.EECS4413Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface ItemRepository extends JpaRepository <Item, Integer> {
	
	@Query(value = "SELECT * FROM items WHERE item_Name = ?1", nativeQuery = true)
	Item findByItemName(String itemName);
	
	@Modifying
	@Query(value = "DELETE FROM items WHERE item_Name = ?1", nativeQuery = true)
	void deleteByItemName(String itemName);
}
