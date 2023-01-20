<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<!-- Put the java code in the delimiters. -->

    <!-- Decalaration -->
	<%!
		int coef = 3;
	%>
	
	<h1> Hello World </h1>
	
	<!-- Scriptlet Tags  -->
	<%
		int i = 9;
		out.println(7+5);
	%>
	
	
	<!-- Expression -->
	My fav Number is : <%= coef %>

</body>
</html>