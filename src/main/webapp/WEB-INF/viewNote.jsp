<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	<body>
		<h1>Simple Note Keeper</h1> 
		<h2>View Note</h2>
		<p><b>Title:</b> ${note.title} </p>
		<p><b>Contents:</b> ${note.contents}</p>
		
		<a href ="note?create = true">Create</a> <br>
		<a href ="note?edit = true">Edit</a></button>
	</body>
</html>
