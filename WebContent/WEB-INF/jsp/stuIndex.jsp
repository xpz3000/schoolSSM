<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input id="abc" type = "text" value="${session}">
		<a href="editPwd?userId=${session}">修改密码</a>
		<a href="deleteCategory?userId=${session}">查看选课</a>
		<a href="stuShowGrade?userId=${session}">查看成绩</a>
		<a href="stuShowMy?userId=${session}">个人信息</a>

</body>
</html>