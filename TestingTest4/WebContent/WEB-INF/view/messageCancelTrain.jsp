<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
</head>

<body>
<form:form action="processCanceltrain" modelAttribute="bookTrain"><br>
  Id:<form:input path="bookId" />
  <br> <input type="submit" value="Cancel Train">
  ${message}
</form:form>
</body>
</html>