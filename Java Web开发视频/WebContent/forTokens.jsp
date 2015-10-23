<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<td>分隔符</td>
		<td>其值</td>
	</tr>		
	<c:forTokens items="jsp开发*spring开发*Hibernate开发*struts2开发" delims="*"
	varStatus="status" begin="1" end="8" var="items">
		<tr>
			<td>${status.index }</td>
			<td>${items}</td>
		</tr>
	</c:forTokens>
</table>

</body>
</html>