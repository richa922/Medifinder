<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<script type="text/javascript">
	function madeAjaxCall(usernameVal, passwordVal) {
		alert('I am in');
		$.ajax({
			type : "post",
			contentType : "application/json",
			url : 'http://localhost:8080/Medical/login',
			cache : false,
			data : JSON.stringify({
				username : usernameVal,
				password : passwordVal,
			}),
			success : function(response) {
				var list = response.d;
				//alert("got it!");
			},
			dataType : 'json'
		});
		alert('I am in 2');
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<%
		String usernameVal = request.getParameter("username");
		String passwordVal = request.getParameter("password");
	%>
	<script type="text/javascript">
	alert('I am in');
	function madeAjaxCall(usernameVal, passwordVal) {
		alert('I am in');
		$.ajax({
			type : "post",
			contentType : "application/json",
			url : 'http://localhost:8080/Medical/login',
			cache : false,
			data : JSON.stringify({
				username : usernameVal,
				password : passwordVal,
			}),
			success : function(response) {
				var list = response.d;
				//alert("got it!");
			},
			dataType : 'json'
		});
		alert('I am in 2');
	}
	</script>
	<%
		//if (true)
		if(usernameVal != null && usernameVal.equals("richa"))
		{
			if(passwordVal != null && passwordVal.equals("123"))
			{
			 out.println("Hello Medi Finder ");
			session.setAttribute("username", usernameVal);
			response.sendRedirect("Home.jsp");
		
			}
		}
			else
			response.sendRedirect("Error.jsp");
	%>
</body>
</html>