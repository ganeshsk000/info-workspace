<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>viewAllNewspaperDetails</title>
</head>
<body>
<h1>Newspaper Details Readed Sucessfully,,,,,,,</h1>
<hr>
<c:forEach items="${ListOfNewspaper}" var="newspaperObj">
<tr>
<td>${newspaperObj.newspaperName}</td><br>
<td>${newspaperObj.price}</td><br>
<td>${newspaperObj.language}</td><br>
<td>${newspaper.noOfPages}</td><br>
<hr>
</tr>
</c:forEach>

</body>
</html>