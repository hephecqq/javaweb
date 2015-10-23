<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Random rand=new Random();

%>
<c:set var="num">
	<%=rand.nextInt(5)%>
</c:set>
	<c:choose>
		<c:when test="${num==1}">随机数为1</c:when>
		<c:when test="${num==2}">随机数为2</c:when>
		<c:when test="${num==3}">随机数为3</c:when>
		<c:when test="${num==4}">随机数为4</c:when>
		<c:otherwise>不行啦！</c:otherwise>
		
	</c:choose>
</body>
</html>