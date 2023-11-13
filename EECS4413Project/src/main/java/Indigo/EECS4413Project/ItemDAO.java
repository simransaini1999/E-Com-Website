package Indigo.EECS4413Project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
@Repository
public class ItemDAO  {
	Auction auction;
	Item item;
	
	@Autowired
	ItemRepository itemrepo;
	

	public List<Item> readAll(){
		String query = "SELECT * FROM items";
		List<Item> items = new ArrayList<>();


		try(Connection conn = DatabaseConnection.connect()){
			PreparedStatement ps1 = conn.prepareStatement(query);
			ResultSet resultSet = ps1.executeQuery();

			if(resultSet.next()) {
				Item item = new Item();
				item.setItemID(resultSet.getInt("ID"));
				item.setAuctionType(resultSet.getString("auction_Type"));
				item.setItemName(resultSet.getString("item_Name"));
				item.setStartingBidPrice(resultSet.getInt("starting_Bid_Price"));
				item.setItemDescription(resultSet.getString("item_Description"));
				item.setShipmentPrice(resultSet.getInt("shipment_Price"));
				item.setExpeditedShipmentPrice(resultSet.getInt("expedited_Shipment_Price"));
				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}

	public Item read(String itemName) {
		String query = "SELECT * FROM items WHERE ItemName = ?";
		Item item = null;

		try(Connection conn = DatabaseConnection.connect()){

			PreparedStatement ps1 = conn.prepareStatement(query);
			ps1.setString(1, itemName);
			try (ResultSet rs = ps1.executeQuery()) {
				//Check if a result was returned
				if (rs.next()) {
					item = new Item();
					item.setItemID(rs.getInt("ID"));
					item.setAuctionType(rs.getString("AuctionType"));
					item.setItemName(itemName);
					item.setStartingBidPrice(rs.getInt("StartingBidPrice"));
					item.setItemDescription(rs.getString("ItemDescription"));
					item.setShipmentPrice(rs.getInt("ShipmentPrice"));
				}
			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		return item;
	}

	public void create(Item item) {
		Item item1 = new Item();
		item1.setItemName(item.getItemName());
		item1.setItemDescription(item.getItemDescription());
		item1.setAuctionType(item.getAuctionType());
		item1.setStartingBidPrice(item.getStartingBidPrice());
		item1.setShipmentPrice(item.getShipmentPrice());
		item1.setExpeditedShipmentPrice(item.getExpeditedShipmentPrice());
		
		
		
//		String query = "INSERT INTO items(itemName, itemDescription, auctionType, startingBidPrice, shipmentPrice, expeditedShipmentPrice) VALUES (?,?,?,?,?,?)";
//		try (Connection conn = DatabaseConnection.connect();
//				PreparedStatement pstmt = conn.prepareStatement(query)) {
//			pstmt.setString(2, item.getItemName());
//			pstmt.setString(3, item.getItemDescription());
//			pstmt.setString(4, item.getAuctionType());
//			pstmt.setInt(5, item.getStartingBidPrice());
//			pstmt.setInt(6, item.getShipmentPrice());
//			pstmt.setInt(7, item.getExpeditedShipmentPrice());
//			pstmt.executeUpdate();
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}
		
		itemrepo.save(item1);
		
	}
	public void remove(String itemName) {
		String query = "Delete From items where ItemName = ?";
		try (Connection conn = DatabaseConnection.connect();
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setString(1, itemName);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


}
