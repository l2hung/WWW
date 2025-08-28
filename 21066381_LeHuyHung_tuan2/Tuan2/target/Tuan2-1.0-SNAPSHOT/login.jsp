<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 8/28/2025
  Time: 7:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<h2>Login Giả Lập</h2>

<form action="bai1.jsp" method="get">
    <input type="hidden" name="action" value="login" />
    <button type="submit">Login</button>
</form>

<p style="color: gray;">Trang này chỉ hiển thị khi chưa đăng nhập và truy cập vào /hello</p>
</body>
</html>
