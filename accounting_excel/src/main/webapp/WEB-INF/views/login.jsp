<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name="frm" method="post">
	<div>
		<label for="userID">ID</label>
		<input id="userID" type="text" name="id" placeholder="ID" required>
		<label for="password">Password</label>
		<input id="password" type="password" name="pw" placeholder="PASSWORD" required>
	</div>
	<input type="submit" value="로그인" onclick="doLogin()"/>
	<input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}" />

</form>
<c:if test="${not empty error}">
	<div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
	<div class="msg">${msg}</div>
</c:if>

</body>
</html>