
<%@page import="ca.sait.simplenotekeeper.javabeans.Note"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	<body>
		<h1>Simple Note Keeper</h1> 
		<h2>Edit Note</h2>

		<form action = "note" method = "post">
			<label for ="title"><b>Title:</b></label>
			<input type ="text" name ="title" id ="title" placeholder = ${note.title}> <br>
			<label for ="contents" style = "vertical-align: bottom"><b>Contents:</b></label>
			<input type ="text" name ="contents" id ="contents" placeholder = ${note.contents} style = "width: 170px; height: 150px;"><br>
			<button type ="submit">Save</button>
		</form>
	</body>
</html>
