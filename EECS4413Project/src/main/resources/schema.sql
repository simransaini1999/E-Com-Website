CREATE TABLE users (
	ID LONG AUTO_INCREMENT PRIMARY KEY,
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
    ItemName VARCHAR(255) NOT NULL,
    ItemDescription VARCHAR(255) NOT NULL,
    AuctionType VARCHAR(255) NOT NULL,
    StartingBidPrice INTEGER,
    ShipmentPrice INTEGER,  -- Added comma here
    ExpeditedShipmentPrice INTEGER
);



