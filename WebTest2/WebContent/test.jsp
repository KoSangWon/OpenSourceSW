<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.GregorianCalendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	GregorianCalendar now = new GregorianCalendar();
	String date = String.format("%TF", now);
	String time = String.format("%TT", now);
	int total = 0;
	for(int cnt = 1; cnt <= 100; cnt++) total+=cnt;
%>
오늘 날짜: <%=date %><BR>
현재 시각: <%=time %><BR>
1부터 100까지 더한 값은? <%=total %>
</body>
</html>