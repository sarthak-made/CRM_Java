
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
    <h1 class="w3-jumbo"><b>CRM System </b></h1>
    <h1 class="w3-xxxlarge w3-text-red"><b>Dashboard</b></h1>
    <hr style="width:50px;border:5px solid red" class="w3-round">
    <p>This Customer Relationship Management (CRM) system has been made using the Spring MVC Framework to build the 
    	structure of the Web Application, MVC Pattern stands for Model View Controller, wherein the Front Controller
    	i.e. Dispatcher Servelet takes any incoming requests from web.xml file and them maps them to their
    	 corresponding controller, The Controllers work with the business logic i.e. the model and give back
    	 a model and view to the DispatcherServelet which in turn then resolves the view to be used and sends it back
    	 as a response to the get request received by the application.</p>
   	<p> Technologies used in this project are -
   		<ul>
   			<li> Spring MVC Framework </li>
   			<li> JSP and Servlets </li>
   			<li> Hibernate </li>
   			<li> MySQL </li>
   		</ul> 
   	</p> 
  </div>
  <!-- 
  <div class="w3-container" id="packages" style="margin-top:75px">
    <h1 class="w3-xxxlarge w3-text-red"><b>Packages.</b></h1>
    <hr style="width:50px;border:5px solid red" class="w3-round">
    <p>Some text our prices. Lorem ipsum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure</p>
  </div>

  <div class="w3-row-padding">
    <div class="w3-half w3-margin-bottom">
      <ul class="w3-ul w3-light-grey w3-center">
        <li class="w3-dark-grey w3-xlarge w3-padding-32">Basic</li>
        <li class="w3-padding-16">Floorplanning</li>
        <li class="w3-padding-16">10 hours support</li>
        <li class="w3-padding-16">Photography</li>
        <li class="w3-padding-16">20% furniture discount</li>
        <li class="w3-padding-16">Good deals</li>
        <li class="w3-padding-16">
          <h2>$ 199</h2>
          <span class="w3-opacity">per room</span>
        </li>
        <li class="w3-light-grey w3-padding-24">
          <button class="w3-button w3-white w3-padding-large w3-hover-black">Sign Up</button>
        </li>
      </ul>
    </div>
        
    <div class="w3-half">
      <ul class="w3-ul w3-light-grey w3-center">
        <li class="w3-red w3-xlarge w3-padding-32">Pro</li>
        <li class="w3-padding-16">Floorplanning</li>
        <li class="w3-padding-16">50 hours support</li>
        <li class="w3-padding-16">Photography</li>
        <li class="w3-padding-16">50% furniture discount</li>
        <li class="w3-padding-16">GREAT deals</li>
        <li class="w3-padding-16">
          <h2>$ 249</h2>
          <span class="w3-opacity">per room</span>
        </li>
        <li class="w3-light-grey w3-padding-24">
          <button class="w3-button w3-red w3-padding-large w3-hover-black">Sign Up</button>
        </li>
      </ul>
    </div>
  </div>
  -->
  <!--  
  <div class="w3-container" id="contact" style="margin-top:75px">
    <h1 class="w3-xxxlarge w3-text-red"><b>Contact.</b></h1>
    <hr style="width:50px;border:5px solid red" class="w3-round">
    <p>Do you want us to style your home? Fill out the form and fill me in with the details :) We love meeting new people!</p>
    <form action="/action_page.php" target="_blank">
      <div class="w3-section">
        <label>Name</label>
        <input class="w3-input w3-border" type="text" name="Name" required>
      </div>
      <div class="w3-section">
        <label>Email</label>
        <input class="w3-input w3-border" type="text" name="Email" required>
      </div>
      <div class="w3-section">
        <label>Message</label>
        <input class="w3-input w3-border" type="text" name="Message" required>
      </div>
      <button type="submit" class="w3-button w3-block w3-padding-large w3-red w3-margin-bottom">Send Message</button>
    </form>  
  </div>
  -->
<!-- End page content -->
</div>

<!--    <div style="text-align: center">
        <h2>
            Hey You..!! This is your 1st Spring MCV Tutorial..<br> <br>
        </h2>
        <h3>
            <a href="welcome.html">Click here to See Welcome Message... </a>(to
            check Spring MVC Controller... @RequestMapping("/welcome"))
        </h3>
    </div>
-->

</body>
</html>