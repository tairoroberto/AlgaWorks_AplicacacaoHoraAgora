<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.logging.SimpleFormatter"%>
<%@page import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Data e hora atual</title>
</head>
<body>

	<%
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat(
				"dd/MM/yyyy  hh:mm:ss");
		String dataHora = formatter.format(date);
	%>
	
	<h1>A data e hora atual:</h1>
	<%= dataHora %>

</body>
</html>