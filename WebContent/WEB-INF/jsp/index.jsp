
<%@ page language="java" contentType="text/html; charset=UTF-8"

	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<head>
    <title>用户登录页面</title>
</head>
<body>
     <form action="${pageContext.request.contextPath}/login" method="post">
        <table>
            <tr>
               <td>用户名:</td>
                <td><input name="userId" type="text"></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input name="userPwd" type="password"></td>
            </tr>
            <tr >
                <td><input type="submit" value="登录"  ></td>    
            </tr>
        </table>
    </form>
</body>

</html>
