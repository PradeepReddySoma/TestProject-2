<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
</head>

<body>
	<table>
		<tr>Listing all train and passenger list</tr>
		
		<tr>
			<th>trainName</th>
			<th>trainFare</th>
			<th>seatsCount</th>
			<th>fromPlace</th>
			<th>toPlace</th>
			<th>duration</th>
			<th>BookId</th>
			<th>pName</th>
			<th>pContactNumber</th>
			<th>Gender</th>
			<th>age</th>
		</tr>
		<c:forEach var="trainPassengerList" items="${trainPassengerList}">
		   <tr>
		     <td>${trainPassengerList.trainName}</td>
		     <td>${trainPassengerList.trainFare}</td>
		     <td>${trainPassengerList.seat }</td>
		     <td>${trainPassengerList.fromPlace}</td>
		     <td>${trainPassengerList.toPlace}</td>
		     <td>${trainPassengerList.travellDuration }</td>
		     <td>${trainPassengerList.bookId}</td>
		     <td>${trainPassengerList.passengerName}</td>
		     <td>${trainPassengerList.passengerContactNumber}</td>
		     <td>${trainPassengerList.gender}</td>
		     <td>${trainPassengerList.age}</td>
		   </tr>
		</c:forEach>
	</table>
</body>

</html>