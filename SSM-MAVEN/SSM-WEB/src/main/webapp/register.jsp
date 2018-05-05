<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<!-- <table align="center"> -->
		<form action="${ctx }/user/register.html" method="post">
			用户名：<input type="text" name="userName" /><br />
			 密码：<input type="password" name="password" /><br /> 
			 <input type="submit" value="注册" />
			 <input type="reset" value="重置" />
		</form>
	<!-- </table> -->
</body>
</html>