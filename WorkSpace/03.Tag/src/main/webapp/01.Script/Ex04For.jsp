<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1px solid black">
	<% for(int i=2;i<=9;i++){%><tr>
		<%for(int j=1;j<=9;j++){%>
	<td><%=i+"X"+j+"="+i*j %></td>
	
	<% } %> </tr>
	<% }%> </table>
	
	<br>
	
	<table border = "1px solid black">
	<% for(int i=1;i<=9;i++){%><tr>
		<%for(int j=2;j<=9;j++){%>
	<td><%=j+"X"+i+"="+i*j %></td>
	
	<% } %> </tr>
	<% }%> </table>
	
	<br>
	
	<table border = "1px solid black">
	<% for(int i=2;i<=9;i++){%><tr>
		<%for(int j=1;j<=9;j++){%>
		<%if(i%2==0){%>
		<td style="background-color:blue"><%=i+"X"+j+"="+i*j %></td>
		<%}
		else {%>
		<td style="background-color:red"><%=i+"X"+j+"="+i*j %></td>
		<%} %>
	<% } %> </tr>
	<% }%> </table>
	
	<br>
	
	<table border = "1px solid black">
	<% for(int i=2;i<=9;i++){%><tr>
		<%for(int j=1;j<=9;j++){%>
		<%if(j%2==0){%>
		<td style="background-color:blue"><%=i+"X"+j+"="+i*j %></td>
		<%}
		else {%>
		<td style="background-color:red"><%=i+"X"+j+"="+i*j %></td>
		<%} %>
	<% } %> </tr>
	<% }%> </table>
	
	


</body>
</html>