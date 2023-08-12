<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="post">
	<pre>
	 Name<input type="text" name="name"/>
		
	     Email<input type="email" name="email"/>
		Mobile<input type="number" name="mobile"/>
	
			<input type="submit" value="save"/>
			
			${message}
			</pre>
			</form>

</body>
</html>