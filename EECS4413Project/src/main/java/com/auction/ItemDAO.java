package com.auction;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.connection.DatabaseConnection;

public class ItemDAO {

	public List<Item> readAll(){
		String query = "SELECT * FROM items";
		List<Item> items = new ArrayList<>();
		
		try(Connection conn = DatabaseConnection.connect()){
			PreparedStatement ps1 = conn.prepareStatement(query);
			ResultSet resultSet = ps1.executeQuery();
			
			if(resultSet.next()) {
				Item item = new Item();
				item.setAuctionType(resultSet.getString("AuctionType"));
				item.setItemName(resultSet.getString("ItemType"));
				item.setCurrentPrice(resultSet.getInt("CurrentPrice"));
				item.setItemDescription(resultSet.getString("ItemDescription"));
				item.setShipmentPrice(resultSet.getInt("ShipmentPrice"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return items;
	}
	
	public Item read(int id) {
		String query = "SELECT * FROM items WHERE ID = ?";
		Item item = null;
		
		try(Connection conn = DatabaseConnection.connect()){
			
			PreparedStatement ps1 = conn.prepareStatement(query);
			ps1.setInt(1, id);
			try (ResultSet rs = ps1.executeQuery()) {
				//Check if a result was returned
				if (rs.next()) {
					item = new Item();
					item.setItemID(id);
					item.setAuctionType(rs.getString("AuctionType"));
					item.setItemName(rs.getString("ItemName"));
					item.setCurrentPrice(rs.getInt("CurrentPrice"));
					item.setItemDescription(rs.getString("ItemDescription"));
					item.setShipmentPrice(rs.getInt("ShipmentPrice"));
				}
		}
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		return item;
	}
	
	
	public void create(Item item) {
		String query = "INSERT INTO items(ID,ItemName, ItemDescription, AuctionType, CurrentPrice, ShipmentPrice) VALUES (?,?,?,?,?,?)";
		try (Connection conn = DatabaseConnection.connect();
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setString(2, item.getItemName());
			pstmt.setString(3, item.getItemDescription());
			pstmt.setString(4, item.getAuctionType());
			pstmt.setInt(5, item.getCurrentPrice());
			pstmt.setInt(6, item.getShipmentPrice());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
