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
	<h3>웹에서는 데이터를 태그형태나 아니면 jstl, EL 등으로 표현을 할때 getter & setter를 많이 이용함</h3>
	<h3>보통 데이터를 전달하고 readOnly 데이터를 읽어서 쓰는 용도로만 VO(Value Object) 라는 명칭을 새로만듬 (==DTO)</h3>
	<c:forEach items="${kgglist}" var="list">
		<p>int list :${list.num}</p>
	</c:forEach>
	
	<c:forEach items="${kgglist}" var="list">
		<p>String list :${list.str}</p>
	</c:forEach>
</body>
</html>