<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
  <title>List of Trains</title>
</head>
<body>
<%-- 	<form:form action="" modelAttribute="traindetails"> --%>
		<table>
			<tr>
				<td>Trains list</td>
			</tr>
			 <tr>
				<th>Id:</th>
				<th>trainName:</th>
				<th>TrainFare:</th>
				<th>seratsCount:</th>
				<th>fromPlace:</th>
				<th>toPlace:</th>
				<th>Duration:</th>
				<!-- <th>Action</th> -->
			</tr> 
			<c:forEach var="tempCustomers" items="${tDetails}">
			 <c:url var="updateLink" value="/user/showFormForUpdate">
			<c:param name="customerId" value="${tempCustomers.trainsId}" />
			</c:url> 
			
			   <tr>
			     <td>${tempCustomers.trainsId}</td> 
			    <td>${tempCustomers.trainName}</td>
			    <td>${tempCustomers.trainFare}</td>
			    <td>${tempCustomers.seat}</td>
			    <td>${tempCustomers.fromPlace}</td>
			    <td>${tempCustomers.toPlace}</td>
			    <td>${tempCustomers.travellDuration}</td> 
			     <td>
			        <a href="${updateLink}">Update</a>
			     </td> 
			</tr>
			   
			
			</c:forEach>
			
		</table>
<%-- 	</form:form> --%>
</body>

</html>