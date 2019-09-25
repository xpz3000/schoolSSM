<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="stuUpdateMy">
			姓名： <input name="stuName" value="${my.stuName}" type="text"> <br><br>
			性别： <input name="stuSex" value="${my.stuSex}" type="text"> <br><br>
			联系方式： <input name="stuPhone" value="${my.stuPhone}" type="text"> <br><br>
			邮箱： <input name="stuEmail" value="${my.stuEmail}" type="text"> <br><br>
			居住地： <input name="stuAddress" value="${my.stuAddress}" type="text"> <br><br>
			<input type="hidden" value="${my.userId}" name="userId">
			<input type="submit" value="确认修改">
		</form>
</body>
</html>