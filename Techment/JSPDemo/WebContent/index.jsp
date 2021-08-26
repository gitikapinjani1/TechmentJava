<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> This is my first JSP</h1>
<% 
int a=10;
int b=20;
int c=a+b;
out.print("result = "+c+"<br>");

for(int i=0;i<=5;i++)
{
	out.print("hello" + i +"<br>");
}

%>

<form action="Login.jsp">
<input type="text" name="u" placeholder="Enter Username">
<input type="password" name="p" placeholder="Enter password">
<input type="submit" value ="Login">


</form>






</body>
</html>