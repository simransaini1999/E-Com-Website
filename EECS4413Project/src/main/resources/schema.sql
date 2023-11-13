CREATE TABLE users (
	ID INTEGER AUTO_INCREMENT PRIMARY KEY,
	fName VARCHAR(255) NOT NULL,
	lName VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	streetNumber VARCHAR(255) NOT NULL,
	streetName VARCHAR(255) NOT NULL,
	postalCode VARCHAR(255) NOT NULL,
	city VARCHAR(255) NOT NULL,
	country VARCHAR(255) NOT NULL,
	username VARCHAR(255) NOT NULL,
	password VARCHAR(255) NOT NULL
);


CREATE TABLE items (
    ID INTEGER AUTO_INCREMENT PRIMARY KEY,
    itemName VARCHAR(255) NOT NULL,
    itemDescription VARCHAR(255) NOT NULL,
    auctionType VARCHAR(255) NOT NULL,
    startingBidPrice INTEGER,
    shipmentPrice INTEGER,  
    expeditedShipmentPrice INTEGER
);



