<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="LogoutServlet" method="post">
	<%
		String name = null;
		String sessionID = null;
		Cookie cookie[] = request.getCookies();
		if (cookie != null) 
		{	
			for (Cookie ck : cookie) 
			{
				
				if(ck.getName().equalsIgnoreCase("JSESSIONID")) 
					{
					sessionID = ck.getValue();
					}
			}
		}
	%>



<h2>Session ID = <%=sessionID %></h2>
<br><br>

</form>
</body>
</html>

</body>
</html>