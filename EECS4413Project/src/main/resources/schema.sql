CREATE TABLE users (
	ID INTEGER AUTO_INCREMENT PRIMARY KEY,
	first_Name VARCHAR(255) NOT NULL,
	last_Name VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	street_Number VARCHAR(255) NOT NULL,
	street_Name VARCHAR(255) NOT NULL,
	postal_Code VARCHAR(255) NOT NULL,
	city VARCHAR(255) NOT NULL,
	country VARCHAR(255) NOT NULL,
	username VARCHAR(255) NOT NULL,
	password VARCHAR(255) NOT NULL
);


CREATE TABLE items (
    ID INTEGER AUTO_INCREMENT PRIMARY KEY,
    ItemName VARCHAR(255) NOT NULL,
    ItemDescription VARCHAR(255) NOT NULL,
    AuctionType VARCHAR(255) NOT NULL,
    StartingBidPrice INTEGER,
    ShipmentPrice INTEGER,  -- Added comma here
    ExpeditedShipmentPrice INTEGER
);



