<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="background-color: gray;">
	<label style="display: inline-block; padding: 10px; color: white;">hoge.Inc</label>
	<label style="padding: 10px; font-size: 10px;">
		<% Date date = new Date();
    	 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
   		 String formatDate = sdf.format(date);
   		out.print(formatDate); %>
	</label>
</div>
</body>
</html>