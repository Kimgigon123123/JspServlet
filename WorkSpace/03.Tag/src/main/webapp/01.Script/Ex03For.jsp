<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3> 반복문</h3>
	
	<!--  p태그가 10번 출력되게 만들어 보기 (1번문제)
	p태그에 i값 0~9까지가 출력되게 만들어보기 (2번문제)-->
	<%
		for(int i =0; i < 10; i++){%>
			
			<p> 안녕 </p>
			
		<%}%>
	
	<%! int num=0; %>
	
	<%
		for(int i =0; i < 10; i++){%>
			
			<p> <%=num %> </p>
			<%num++; %>
		<%}%>
		
	<!--  i가 홀수인지 짝수인지를 판단해서 출력해보기 -->
	
	<%for(int i=0;i<10;i++) {%>
	
	<%if(i%2==0){ %>
	<p>변수출력 : <%=i+"짝수" %></p>
	<%}else{ %>
	<p>변수출력 : <%=i+"홀수" %></p>
	<%}%>
	<%}%>
	
	
</body>
</html>