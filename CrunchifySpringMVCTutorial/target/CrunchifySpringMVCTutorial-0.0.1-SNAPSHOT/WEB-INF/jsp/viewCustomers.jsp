<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Consumer Relationship Database - Dashboard</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
<style type="text/css">
body,h1,h2,h3,h4,h5 {font-family: "Poppins", sans-serif}
body {font-size:16px;}
table { width:80%; }
tr:hover {background-color:w3-red}
</style>
</head>
<body>
	<nav class="w3-sidebar w3-red w3-collapse w3-top w3-large w3-padding" style="z-index:3;width:300px;font-weight:bold;" id="mySidebar"><br>
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-button w3-hide-large w3-display-topleft" style="width:100%;font-size:22px">Close Menu</a>
  <div class="w3-container">
    <h3 class="w3-padding-64"><b>CRM Database<br>Dashboard</b></h3>
  </div>
  <div class="w3-bar-block">
    <a href="index.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Home</a> 
    <a href="viewCustomers.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">View Customers</a> 
    <a href="addCustomers.html" onclick="w3_close()" class="w3-bar-item w3-button w3-hover-white">Add Customers</a> 
  </div>
</nav>
<div class="w3-main" style="margin-left:340px;margin-right:40px">

  <!-- Header -->
  <div class="w3-container" style="margin-top:80px" id="showcase">
    <h1 class="w3-jumbo"><b>Dashboard </b></h1>
    <h1 class="w3-xxxlarge w3-text-red"><b>View Customer Info</b></h1>
    <hr style="width:50px;border:5px solid red" class="w3-round">
  </div>
  
  <!-- Packages / Pricing Tables -->
  <div class="w3-container" id="packages" style="margin-top:75px">
    <p>The Dispatcher Servelet receives a request for viewCustomer.html and it then calls the corresponding controller which is mapped to it, the controller returns a model and a view back to the Dispatched Servelet which is then resolved and displayed. The Model contains the customer entires fetched from the MySQL database through Object Relational Mapping (ORM) using Hibernate.</p>
  </div>

  <div class="w3-row-padding ">
    <div class="w3-half w3-margin-bottom">
      <table class = "w3-table w3-centered w3-striped">
      	<tr>
      		<th> CustomerID </th>
	      	<th> First Name </th>
	      	<th> Last Name </th>
	      	<th> Email ID </th>
      	</tr>
      	${message}
      </table>
    </div>
        
</div>
</body>
</html>



