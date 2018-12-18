<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/pradeep.css">

<style>
</style>
</head>
<body>
	<div id="outer">
		<div id="header">
			<div id="header1">
				<div id="logo">
					<img
						src="${pageContext.request.contextPath}/resources/images/northstar.jpg">
				</div>
				<div id="banner">
					<img
						src="${pageContext.request.contextPath}/resources/images/transp2.jpg">
				</div>
			</div>
			<div id="header2" align="center">

				<div id="ViewTrain">
					<a href="ViewTrain"><font color="black">View Train</font></a>
				</div>

				<div id="BookTrain">
					<a href="BookTrain"><font color="black">BookTrain</font></a>
				</div>

				<div id="CancelTrain">
					<a href="CancelTrain"><font color="black">CancelTrain</font></a>
				</div>

			</div>

		</div>
		<div id="subBody" align="center"
			style="background: pink; border: 8px solid black">
			<div id="AdminLogin" color="black">
				<h2><b>----------->Admin Login Form<----------</b></h2>
				<hr>
			</div>
			<form:form modelAttribute="user" action="processForm">

				<h3 style="text-align: left;">User Name:</h3>
				<form:input path="userName" style="width:450px;" />
				<br>
				<br>
				<h3 style="text-align: left;">Password:</h3>
				<form:input path="password" style="width:450px;" />
				<br>
				<br>
				<br>

				<input type="submit" value="submit"
					style="width: 250px; font-size: 18px">
				
			</form:form>
			<!--		   <br><br><br><input type="submit" value="submit" style="width:250px;font-size:18px"> -->
		</div>
	</div>
	
</body>
</html>
