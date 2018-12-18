<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
   <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/addTrain.css">
  <style>
  
	
  </style>
  </head>
 <body>
 
 THis is the update page
	<div id="outer">
	   <div id="header">
	      <div id="header1">
		    <div id="logo">
		       <img src="${pageContext.request.contextPath}/resources/images/northstar.jpg"/>
		    </div>
		    <div id="banner">
		      <img src="${pageContext.request.contextPath}/resources/images/transport.jpg"/>
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
           </form:form> 
		   </div>
	   </div>
	</div> 
  </body>
</html>
     