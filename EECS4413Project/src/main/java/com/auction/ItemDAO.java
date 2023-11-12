package com.auction;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.connection.DatabaseConnection;

public class ItemDAO {
	Auction auction;
	Item item;
	
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
				item.setStartingBidPrice(resultSet.getInt("StartingBidPrice"));
				item.setItemDescription(resultSet.getString("ItemDescription"));
				item.setShipmentPrice(resultSet.getInt("ShipmentPrice"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return item;
	}


	public void create(Item item) {
		String query = "INSERT INTO items(ID,ItemName, ItemDescription, AuctionType, StartingBidPrice, ShipmentPrice, ExpeditedShipmentPrice) VALUES (?,?,?,?,?,?,?)";
		try (Connection conn = DatabaseConnection.connect();
				PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setString(2, item.getItemName());
			pstmt.setString(3, item.getItemDescription());
			pstmt.setString(4, item.getAuctionType());
			pstmt.setInt(5, item.getStartingBidPrice());
			pstmt.setInt(6, 25);
			pstmt.setInt(7, 50);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
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
