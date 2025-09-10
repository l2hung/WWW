<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Đăng ký tài khoản</title>
</head>
<body>
	<h1>User Registration Form</h1>
	<form action="<%=request.getContextPath()%>/bai2/RegisterServlet"
		method="post">
		<input type="text" placeholder="First Name" id="firstName"
			name="firstName" required> <br> <br> <input
			type="text" placeholder="Last Name" id="lastName" name="lastName"
			required><br> <br> <input type="text"
			placeholder="Your Email" id="email" name="email" type="email"
			required><br> <br> <input type="text"
			placeholder="Re-Enter your Email" id="reemail" name="reemail"
			type="email" required><br> <br> <input
			type="password" id="password" name="password" required
			placeholder="New Password"><br> <br> Birthday: <br>
		<select name="dobDay">
			<option value="">Day</option>
			<%
			for (int i = 1; i <= 31; i++) {
			%>
			<option value="<%=i%>"><%=i%></option>
			<%
			}
			%>
		</select> <select name="dobMonth">
			<option value="">Month</option>
			<option value="1">January</option>
			<option value="2">February</option>
			<option value="3">March</option>
			<option value="4">April</option>
			<option value="5">May</option>
			<option value="6">June</option>
			<option value="7">July</option>
			<option value="8">August</option>
			<option value="9">September</option>
			<option value="10">October</option>
			<option value="11">November</option>
			<option value="12">December</option>
		</select> <select name="dobYear">
			<option value="">Year</option>
			<%
			for (int i = 1980; i <= 2024; i++) {
			%>
			<option value="<%=i%>"><%=i%></option>
			<%
			}
			%>
		</select> <br> <br> Gender: <input type="radio" name="gender"
			value="Male"> Male <input type="radio" name="gender"
			value="Female"> Female<br> <br> <input
			type="submit" value="Sign Up">
	</form>

	<h2>Danh sách tài khoản đã đăng ký:</h2>
	<table border="1">
		<tr>
			<th>Tên đăng nhập</th>
		</tr>
		<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.firstName}  	${user.lastName}  	${user.email} 	${user.day}/${user.month}/${user.year} 	${user.gender}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>