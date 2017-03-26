<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<button onclick="window.location='login.jsp'">Logout</button>

<%
String varUname = (String) request.getSession().getAttribute("uname");
String varEmailId = (String) request.getSession().getAttribute("emailid");
String varContact = (String) request.getSession().getAttribute("contact");
%>
<h1> User Information : </h1>
 
<%if (varUname != null){%>
	User Name = <%=varUname%>
	<br>
<%}%>

 
<%if (varEmailId != null){%>
	Email ID = <%=varEmailId%>
	<br>
<%}%>

 
<%if (varContact != null){%>
	Contact No = <%=varContact%>
	<br>
<%}%>
</body>
</html>