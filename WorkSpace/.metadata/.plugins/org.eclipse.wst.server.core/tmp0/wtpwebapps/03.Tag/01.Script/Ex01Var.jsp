<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>변수 사용해보기</h3>
	<%! int sVal =0; %> <!-- 전역변수 -->
	<% int lVal =0; %> <!--  로직코드(지역변수) -->
	
	<p>sVal<%=++sVal %></p> <!-- syso() -->
	<p>lVal<%=++lVal %></p>
	<!--  지역변수 (로직코드) 블럭킹을 통해서 4의 크기를 가진 배열을 만든다. 배열은
	각각의 index에 T,E,S,T 라는 문자열이 들어있어야한다.
	배열을 만든후 표현문 태그로 각각의 문자를 출력해보기.
	정답 : 배열을 만든 후 jsp 페이지에 T E S T 가 각각 배열을 이용해서 출력되면 된다.-->
	
	<%! String[] arr = {"T","E","S","T"};
		ArrayList<String> strList = new ArrayList<>();
		
	
	%>
	<p><%= arr[0]+arr[1]+arr[2]+arr[3] %></p>
	
	
	
	
	
</body>
</html>