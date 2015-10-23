<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.hephec.model.*" %>
<%@page import="java.util.HashMap"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<c:set var="allCount" value="${allCount+1}" scope="application"></c:set>
	<c:set var="count" value="${count+1}" scope="session"></c:set>
	<tr>
		<td>今天网站的访问本网站的人数为:${allCount}</td>
		<td>今天你访问了此网站的此时为：${count}</td>
	</tr>
<c:set var="test" value="by value property"></c:set>
<c:set var="test">by body</c:set>
</table>
<br/>
<br/>
<%
	request.setAttribute("user", new User());
	request.setAttribute("map", new HashMap<String,String>());
	
%>
<br/>
<c:set target="${user}" property="name" value="${param.name}"/>
${user.name}
<c:set target="${map}" property="name" value="${param.name}"/>
${map.name}
</body>
</html>