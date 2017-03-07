<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 提示对应信息 -->
	<a style="color:red">${msg}</a>
	<form action="login.do" method="post">
		用户：<input name="email"><br/>
		密码：<input name="password"><br/>
		<input type="submit" value="登录">
	</form>
	<a>用户名和密码是：admin/admin</a>
</body>
</html>

