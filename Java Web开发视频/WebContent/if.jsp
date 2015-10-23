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
<!-- 创建if.jsp页面，把判断的条件写在test的属性中，为(param.action=='星期几?') -->
<fieldset>
	<c:if test="${param.action=='mon'}">
		周一了:工作的第一天，要加油哦！
	</c:if>
	<c:if test="${param.action=='tuet' }">
		周二了
	</c:if>
	<c:if test="${param.action=='wed'}">
		周三了:工作的第三天，要加油哦！
	</c:if>
	<c:if test="${param.action=='tuet' }">
		周四了
	</c:if>
	<c:if test="${param.action=='mon'}">
		周伍了:工作的第一天，要加油哦！
	</c:if>
	<c:if test="${param.action=='tuet' }">
		周六了
	</c:if>
	<c:if test="${param.action=='mon'}">
		周末了！
	</c:if>
	
	
</fieldset>
</body>
</html>