<%@ page language="java" import="com.db.*, java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	
		DataBaseDemo.getConnection();
		ResultSet rs = DataBaseDemo.getAllEmployees();
		while(rs.next()){
			String a = rs.getString(1);
			int b = rs.getInt(2);
			out.println(a + "    "+ b + "<br>");
			out.println("--------------------------------------"+"<br>");
		}
	
	%>

</body>
</html>