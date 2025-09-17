<%@ page import="java.util.*,fit.iuh.se.tuan4.model.User" %>
<!DOCTYPE html>
<html>
<head>
  <title>Registered Users</title>
</head>
<body>
<h2>List of Registered Users</h2>
<table border="1">
  <tr>
    <th>First Name</th><th>Last Name</th><th>Email</th><th>Gender</th><th>Birthday</th>
  </tr>
  <%
    List<User> users = (List<User>) request.getAttribute("userList");
    for(User u : users) {
  %>
  <tr>
    <td><%= u.getFirstName() %></td>
    <td><%= u.getLastName() %></td>
    <td><%= u.getEmail() %></td>
    <td><%= u.getGender() %></td>
    <td><%= u.getBirthday() %></td>
  </tr>
  <% } %>
</table>
</body>
</html>
