<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 利用Java程序片断动态生成下来列表 -->
<%
	String[] dept={"策划部","销售部","研发部","测试部","人事部"};
%>
<table>
	<tr>
		<td>员工信息查询</td>
	</tr>
	<tr>
		<td>员工姓名:<input type="text" name="name"/></td>
		<td>年龄:<input type="text" name="age"/></td>
		<td>所在部门:
			<select>
				<%
					for(int i=0;i<dept.length;i++){
				%>
				<option value="<%=dept[i]%>"><%=dept[i]%></option>
				<%} %>
			</select>
		</td>
		<td><input type="button" value="查询"/></td>
	</tr>
	
</table>
</body>
</html>