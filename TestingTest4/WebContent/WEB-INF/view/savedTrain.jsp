<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
  <style>
  *{
    margin:0px;
	padding:0px;
  }
    #outer{
	  width:100%;
	  height:800px;
	  background-color:grey;
	}
	#header{
	   width:100%;
	   height:200px;
	   background-color:blue;
	}
	#header1{
	   width:100%;
	   height:100px;
	   background-color:pink;
	}
	#header2{
	  width:100%;
	  height:100px;
	  background-color:red;
	  padding:8px;
	}
	#logo{
	   width:100px;
	   height:100px;
	   background-color:green;
	   float:left;
	}
	#banner{
	   width:1248px;
	   height:100px;
	   background-color:black;
	   float:left;
	}
	
	#AboutUs{
	   width:400px;
	   height:100px;
	   background-color:#6495ED;
	   float:left;
	   line-height:80px;
	
	}
	#ContactInfo{
	   width:475px;
	   height:100px;
	   background-color:#4169E1;
	   float:left;
	   line-height:80px;
	}
	#Booking{
	   width:35%;
	   height:100px;
	   background-color:blue;
	   float:left;
	   line-height:80px;
	}
	#subBody{
	  width:450px;
	  height:425px;
	  margin:45px;
	  margin-left:400px;
	  background-color:pink;
	}
	#subBody1{
	  width:98%;
	  height:50px;
	  border:5px solid blue;
	   text-align:center;
	   font-size:25px;
	   padding:3px;
	}
	#trainName{
	   font-size:20px;
	}
	
  </style>
  </head>
 <body>
 
 THis is the update page
	<div id="outer">
	   <div id="header">
	      <div id="header1">
		    <div id="logo">
		       <img src="northstar.jpg"/>
		    </div>
		    <div id="banner">
		      <img src="transport.jpg"/>
		    </div>
		    
		  </div>
		  <div id="header2" align="center">
		  
		     <div id="AboutUs">
			   <a href="AboutUs.html"><font color="black">About Us</font></a>
			 </div>
			 
			 <div id="ContactInfo">
			  <a href="ContactUs.html"><font color="black">Contact Us</font></a>
			 </div>
			 
			 <div id="Booking">
			   <a href="booking.html"><font color="black">Book Ticket</font></a>
			 </div>
			 
		  </div>
	   
	   </div>
	   <div id="subBody" align="center" style="background:pink;border:4px solid blue">
           <div id="subBody1">
		      ---------->Save Train Form<------------
		   </div>
		   
		   <div id="trainName">
            <br>  <form:form action="processTrainDetail" modelAttribute="traindetails">		   
 		    <br> Id:<form:input path="trainsId" size="30px"/><br>
 		   <br> Train Name:<form:input path="trainName" size="30px"/><br>
			<br> Train Fare:<form:input path="trainFare" size="30px"/><br>
			<br> No.of Seats:<form:input path="seat" size="30px"/><br>
			<br>From Place:<form:input path="fromPlace" size="30px"/><br>
			<br> To place:<form:input path="toPlace" size="30px"/><br>
			<br> Duration:<form:input path="travellDuration" size="30px"/><br>
			
            <br> <input type="submit" value="Save Train" style="width:250px;font-size:18px">
            ${message}
           </form:form> 
		   </div>
	   </div>
	</div> 
  </body>
</html>
     