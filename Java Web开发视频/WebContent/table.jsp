<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 应用java程序片断动态生成表格 -->
<%
	String[] bookName={"JavaWeb","Java","Struts2","Spring","Hibernate"};
%>
<table>
	<tr>
		<td>编号</td>
		<td>书名</td>
	</tr>
	<%
		for(int i=0;i<bookName.length;i++){
	%>
	<tr>
		<td><%=i%></td>
		<td><%=bookName[i] %></td>
	</tr>
	<%} %>
</table>
</body>
</html>