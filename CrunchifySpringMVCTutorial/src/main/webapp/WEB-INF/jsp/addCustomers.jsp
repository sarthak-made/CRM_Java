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
    <h1 class="w3-jumbo"><b>Dashboard</b></h1>
    <h1 class="w3-xxxlarge w3-text-red"><b>Add Customer Relationships</b></h1>
    <hr style="width:50px;border:5px solid red" class="w3-round">
  </div>
  
  <div class="w3-container" id="contact" style="margin-top:75px">
    <p>Fill the below fields and submit to add a new customer into the database</p>
    
    
    <form action="/action_page.php" target="_blank">
      <div class="w3-section">
        <label>First Name</label>
        <input class="w3-input w3-border" type="text" name="Name" required>
      </div>
      <div class="w3-section">
        <label>Last Name</label>
        <input class="w3-input w3-border" type="text" name="Name" required>
      </div>
      <div class="w3-section">
        <label>Email ID </label>
        <input class="w3-input w3-border" type="text" name="Email" required>
      </div>
      <button type="submit" class="w3-button w3-block w3-padding-large w3-red w3-margin-bottom">Add Customer</button>
    </form>
      
  </div>
</div>
</body>
</html>