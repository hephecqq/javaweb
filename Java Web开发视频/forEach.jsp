<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	//创建List集合对象
	List<String> list=new ArrayList<String>();
	list.add("张阿三");
	list.add("李四");
	list.add("张阿三");
	list.add("李四");
	request.setAttribute("list",list);
%>
<c:forEach items="${requestScope.list}"
	var="test" varStatus="id">
		${id.index }<br/>
		${id.count}<br/>
		${id.last }<br/>
		${id.first }<br/>
		${test}<br/>
		${"换行啦..."}
	
</c:forEach>

</body>
</html>