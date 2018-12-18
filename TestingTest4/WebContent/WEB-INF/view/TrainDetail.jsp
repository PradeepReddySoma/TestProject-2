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
	  background-color:white;
	}
	#header{
	   width:100%;
	   height:170px;
	   background-color:blue;
	}
	#header1{
	   width:100%;
	   height:100px;
	   background-color:white;
	}
	#header2{
	  width:100%;
	  height:70px;
	  background-color:red;
 	  /* padding:4px; */
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
	
	#Home{
	   width:350px;
	   height:75px;
	   background-color:grey;
	   float:left;
	   line-height:80px;
	
	}
	#AddTrain{
	   width:350px;
	   height:75px;
	   background-color:grey;
	   float:left;
	   line-height:80px;
	}
	#update{
	   width:350px;
	   height:75px;
	   background-color:grey;
	   float:left;
	   line-height:80px;
	}
	#display{
	   width:299px;
	   height:75px;
	  background-color:grey;
	  float:left;
	  line-height:80px;
	}
	#subBody{
	  width:450px;
	  height:250px;
	  margin:100px;
	  margin-left:400px;
	  padding:40px;
	  background-color:pink;
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
                   <img src="${pageContext.request.contextPath}/resources/images/northstar.jpg">		    </div>
		    <div id="banner">
		      <img src="${pageContext.request.contextPath}/resources/images/transport.jpg">
		    </div>
		    
		  </div>
		  <div id="header2" align="center">
		  
		     <div id="Home">
			   <a href=Home.html"><font color="black">Home</font></a>
			 </div>
			 
			 <div id="AddTrain">
			 <a href="addTrain">addTrain</a>
			  <!--  <form action="addTrain">
			   <input type="submit" value="Add Train">
			      <a href="AddTrain.jsp"><font color="black">Add Train</font></a>
			   </form> -->
			 </div>
			 
			 <div id="update">
			 
			    <a href="updateTrain">Update Train</a> 
			 	
			    
			       <!-- <form action="updateTrain">
			            <input type="submit" value="updateTrain">
			            <a href="UpdateTrain"><font color="black">Update train</font></a>
			    </form>  --> 
			 </div>
			 
			 <div id="display">
			   <a href="TrainAndPassenger"><font color="black">TrainAndPassenger</font></a>
			 </div>
			 
		  </div>
	   
	   </div>
	  
	</div>
  </body>
</html>
     