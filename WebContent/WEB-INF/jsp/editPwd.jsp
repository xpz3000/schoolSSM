<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style="width:500px;margin:0px auto;text-align:center">
	<div style="margin-top:40px">
		<form method="post" action="updatePwd">
			请输入新密码： <input name="userPwd" value="${u.userPwd}" type="password"> <br><br>
			再次输入新密码： <input name="userPwd2" value="${u.userPwd}" type="password"> <br><br>
			<input type="hidden" value="${u.userId}" name="userId">
			<input type="submit" value="确认修改">
		</form>

	</div>	
 </div>

</body>
</html>