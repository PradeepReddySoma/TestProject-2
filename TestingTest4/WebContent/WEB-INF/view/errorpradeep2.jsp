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
	  height:700px;
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
	  height:250px;
	  margin:100px;
	  margin-left:400px;
	 
	  padding:40px;
	  background-color:
	}
	#AdminLogin{
	 border-bottom:10px;
	 position:relative;
	}
	#userName{
	  width:450px;
	  height:35px;
	  
	}
	
  </style>
  </head>
  <body>
	<div id="outer">
	   <div id="header">
	      <div id="header1">
		    <div id="logo">
		       <img src="${pageContext.request.contextPath}/resources/images/northstar.jpg">
		    </div>
		    <div id="banner">
		      <img src="${pageContext.request.contextPath}/resources/images/transport.jpg">
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
	   <div id="subBody" align="center" style="background:pink;border:8px solid black">
           <div id="AdminLogin" color="black">
		   <b>----------->Admin Login Form<----------</b><hr>
		   </div>
		   
		   
		   
		    <form:form modelAttribute="user" action="processForm">
		    
                <h3 style="text-align:left;">User Name:</h3><form:input path="userName" style="width:450px;"/>
		        <br><br><h3 style="text-align:left;"> Password:</h3><form:input path="password" style="width:450px;"/><br><br><br>
		        
		       
		        
               <input type="submit" value="submit" style="width:250px;font-size:18px">
              <br>${message}<br>
				<p></p>
           </form:form> 
		   
<!--		   <br><br><br><input type="submit" value="submit" style="width:250px;font-size:18px"> -->
	  </div>
	</div>
  </body>
</html>
              