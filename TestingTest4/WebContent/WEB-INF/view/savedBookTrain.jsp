<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
  <form:form action="processBookTrain" modelAttribute="bookTrain" >
   <br> BookId:<form:input path="bookId" /><br><br>
   <br> TrainName:<form:input path="trainName" /><br><br>
   <br> PassengerName:<form:input path="passengerName" /><br>
   <br> ContactNumber:<form:input path="passengerContactNumber" /><br>
   <br> Gender:<form:input path="gender" /><br>
   <br> Age:<form:input path="age" /><br>
  <br>  <input type="submit" value="BookTrain"><br>
    ${message}
    </form:form> 
</body>
</html>