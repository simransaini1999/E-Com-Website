
# E_Commerce Website 
The steps required to run our project are as followed:<br>
1- Download the zip.file that is provided with the code.<br>
2- Extract the Zip file that you downloaded on your local device. <br>
3- Open Eclipse and import the project as a maven project. <br>
4- To run the project, click on "Eecs4413ProjectApplication" class and run it as a Java Application. <br>
5- Download the .json file which has all the postman collection commands to test them. Run all the collections in this document. <br>

**Order in which to execute the Postman commands:**
1- createUser

2- createItem

3- authenticate_login

4- get_itemByName

5- selectItem

6- getItemDetailsInAuction

7- doDutchAuction 

8- setForwardAuctionBid

9- checkDutchPayement 

10- checkForwardPayement 


Addition commands that can be tested
get_All_items , delete_items ,updateUser

**URL path parameter that can be edited to get the output as followed**

1- /signup/createuser/  edit JSON body

2- /seller/createitem/itemcontroller/    edit JSON body





**For Frontend:**
To implement the minimal browser-client implementations, on Eclipse simply right-click the page you would like to run and it should run on the server.

Otherwise, in the URL enter the name of the file. 

For example, if I was to run the “Register.jsp” page, my URL would look something like this: http://localhost:8080/EECS4413Project/Register.jsp (http://localhost:8080/EECS4413Project/Register.jsp) 

For each of the .jsp pages, you would do the same thing as the Register.jsp shown above.
