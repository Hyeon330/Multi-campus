<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- tag library를 사용하여 지시부를 정의하여야 한다. -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>setTag : 변수 선언/삭제</h1>
<%
	int a = 1234;
	String b = "홍길동";
%>
<!-- 변수명 -->
<c:set var="num" value="300+5"></c:set>
<c:set var="num2" value="${300+5}"></c:set>
<c:set var="num3">300+5</c:set>
<c:set var="name">세종대왕</c:set>
<c:set var="today" value="<%=new Date() %>"></c:set>
<c:set var="no" value="${200}"></c:set>
<c:set var="aa" value="<%=a %>"></c:set>

<h1>변수값 출력</h1>
a = ${a}<br>
b = ${b}<br>
num = ${num}<br>
num2 = ${num2}<br>
num3 = ${num3}<br>
name = ${name}<br>
today = ${today}<br>
sum = ${num2 + no }<br>
aa : ${aa}<br>
<%=request.getContextPath() %>

<h1>변수 삭제</h1>
<c:remove var="num2"></c:remove>
num2 : ${num2 }<br/>
k : ${k }

</body>
</html>