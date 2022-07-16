<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Newspaper Application,,,,,,,,,</h1>
<hr>
<form action="save.do">
<pre>
Name:<input type="text" name="newspaperName"><br>

Price:<input type="text" name="price"><br>

Language:<input type="text" name="language"><br>

No_Of_Pages:<input type="text" name="noOfPages"><br>

<input type="submit" value="save">
</pre>
</form>

<form action="search.do">

SearchNewspaperByName:<input type="text" name="newspaperName"><br>
<input type="submit" value="searchNewspaper">



</form>
<form>
<a href="view.do"> viewAllNewspaper</a>

</form><br>
<form action="delete.do">
DeleteNewspaperByName:<input type="text" name="newspaperName"><br>
<input type="submit" value="deleteNewspaper">
</form><br>
<form action="searchNewspaper.do">

SearchNewspaperByNames:<input type="text" name="newspaperName"><br>
<input type="submit" value="searchNewspaper">


</form><br>
<form action="update.do">
<h1>Update Newspaper Details,,,,,,</h1>
<pre>
Name:<input type="text" name="newspaperName"><br>

Price:<input type="text" name="price"><br>

Language:<input type="text" name="language"><br>

No_Of_Pages:<input type="text" name="noOfPages"><br>

<input type="submit" value="update">
</pre>
</form>
</body>
</html>