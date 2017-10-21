<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>电动车租赁系统</title>
</head>
<body>
	<form action="">
		<div>
			账号：<input type="text" name="userName"><br>
			密码：<input type="password" name="password"><br>
			普通用户：<input type="radio" name="userType" value="普通用户" checked="checked">
			管理员 ：<input type="radio" name="userType" value="管理员"><br>
			<input type="submit" value="登录">
			<input type="button" onclick="window.location.href='register.jsp'" value="注册">
		</div>
	</form>	
</body>
</html>