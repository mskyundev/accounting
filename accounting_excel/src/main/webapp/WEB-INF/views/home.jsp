<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<c:if test="${not empty se_id}"><div>${se_id } 님</div></c:if>
<c:if test="${empty se_id}"><div>????</div></c:if>

<P>  The time on the server is ${serverTime}. </P>
<c:forEach items="${list }" var="list">
<div>${list.idx }</div>
</c:forEach>
<a href="login">Login</a>
</body>
</html>
