<%-- 
    Document   : createNote
    Created on : 31-Jan-2022, 3:45:53 PM
    Author     : Ivan&Leila
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	<body>
		<h1>Simple Note Keeper</h1> 
		<h2>Create Note</h2>

		<form action = "note" method = "post">
			<label for ="title"><b>Title:</b></label>
			<input type ="text" name ="title" id ="title" value = "This is the title"> <br>
			<label for ="contents" style = "vertical-align: bottom"><b>Contents:</b></label>
			<textarea type ="text" name ="contents" id ="contents">Contents go here</textarea><br>
			<button type ="submit" value = "save" name = "btn">Save</button>
		</form>
	</body>
</html>
