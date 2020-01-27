<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.king.life_counter.vo.User"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Date" %>
<%
	Date now = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
%>
<html>
<head>
	<title>MainPage</title>
</head>
<body>
	<h1 style="text-align:center">
		<%= sdf.format(now) %>
		<br>
	</h1>
	
	<div>
		<img alt="D-5" src="/src/main/resources/assets/img/soju.jpg">
	</div>
	
	
	

${sessionScope.userInfo.id}

</body>
</html>
