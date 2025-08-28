<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.*, jakarta.servlet.*" %>
<%

  String user = (String) session.getAttribute("user");

  // Xử lý login giả lập
  if (request.getParameter("action") != null && request.getParameter("action").equals("login")) {
    session.setAttribute("user", "admin");
    user = "admin";
  }

  // Xử lý logout
  if (request.getParameter("action") != null && request.getParameter("action").equals("logout")) {
    session.invalidate();
    user = null;
  }
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Bài 1 - Java Servlet Filter</title>
</head>
<body>
<h2>Bài 1 - Java Servlet Filter Demo</h2>

<p>Trạng thái người dùng:
  <strong><%= (user != null) ? user : "Chưa đăng nhập" %></strong>
</p>

<form method="get" action="bai1.jsp">
  <% if (user == null) { %>
  <button type="submit" name="action" value="login">Login</button>
  <% } else { %>
  <button type="submit" name="action" value="logout">Logout</button>
  <% } %>
</form>

<hr/>

<p>
  <a href="hello">Truy cập HelloServlet</a> (Được bảo vệ bởi AuthenticationFilter)
</p>

<p>
  Mọi request đều đi qua LoggingFilter → Kiểm tra log ở console.
</p>
</body>
</html>
