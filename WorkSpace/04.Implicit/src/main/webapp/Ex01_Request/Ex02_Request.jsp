<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>동적으로 여러개를 전송해보기</h1>
	<!--  파라메터를 30개 보낼수있는 구조를 만들기.
			name1...name30까지를 보낼예정.(????)
			요청할 서블릿 Ex02_Request
			Ex02_Request에서는 파라메터 name 1~30 까지를 쭉 출력하기.
			HTML(X),JSP <-
		 -->
		 
		 <form action="../Ex02_Request" method="get">
		 		<!--  입력받은 id와 pw를 servlet파일로 보내기 -->
		 		<%for(int i=1; i<=30 ; i ++) {%>
		 		<input type="text" name="name<%=i %>" value="<%=i%>">
		 		<%} %>
		 			<input type = "submit">
</body>
</html>