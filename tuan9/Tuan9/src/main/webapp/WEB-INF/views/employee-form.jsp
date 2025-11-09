<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Form</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 20px; background-color: #f4f4f4; }
        .container { max-width: 600px; margin: 0 auto; background-color: white; padding: 30px; border-radius: 8px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }
        h1 { text-align: center; color: #333; }
        .form-group { margin-bottom: 20px; }
        label { display: block; margin-bottom: 5px; font-weight: bold; color: #555; }
        input[type="text"], input[type="email"], input[type="date"], textarea { width: 100%; padding: 10px; border: 1px solid #ddd; border-radius: 4px; box-sizing: border-box; font-size: 14px; }
        input[type="text"]:focus, input[type="email"]:focus, input[type="date"]:focus, textarea:focus { outline: none; border-color: #4CAF50; box-shadow: 0 0 5px rgba(76, 175, 80, 0.3); }
        .radio-group { display: flex; gap: 20px; }
        .radio-group label { display: inline; margin: 0; font-weight: normal; }
        .error { color: #f44336; font-size: 12px; margin-top: 5px; }
        .button-group { display: flex; gap: 10px; justify-content: center; margin-top: 30px; }
        button { padding: 10px 30px; border: none; border-radius: 4px; cursor: pointer; font-size: 16px; font-weight: bold; }
        .btn-back { background-color: #888; color: white; }
        .btn-submit { background-color: #2196F3; color: white; }
        button:hover { opacity: 0.9; }
    </style>
</head>
<body>
<div class="container">
    <c:choose>
        <c:when test="${employee != null and employee.id != null}">
            <h1>UPDATE EMPLOYEE</h1>
        </c:when>
        <c:otherwise>
            <h1>REGISTRATION EMPLOYEE</h1>
        </c:otherwise>
    </c:choose>

    <form:form method="post" modelAttribute="employee"
               action="${employee != null and employee.id != null ? '/employees/update' : '/employees/add'}">
        <form:hidden path="id"/>

        <div class="form-group">
            <label>First Name</label>
            <form:input path="firstName" placeholder="First Name"/>
            <form:errors path="firstName" cssClass="error"/>
        </div>

        <div class="form-group">
            <label>Last Name</label>
            <form:input path="lastName" placeholder="Last Name"/>
            <form:errors path="lastName" cssClass="error"/>
        </div>

        <div class="form-group">
            <label>Email</label>
            <form:input path="email" type="email" placeholder="Email"/>
            <form:errors path="email" cssClass="error"/>
        </div>

        <div class="form-group">
            <label>Date of Birth</label>
            <form:input path="dateOfBirth" type="date"/>
            <form:errors path="dateOfBirth" cssClass="error"/>
        </div>

        <div class="form-group">
            <label>Phone Number</label>
            <form:input path="phoneNumber" placeholder="Phone number"/>
            <form:errors path="phoneNumber" cssClass="error"/>
        </div>

        <div class="form-group">
            <label>Gender</label>
            <div class="radio-group">
                <label><form:radiobutton path="gender" value="Male"/> Male</label>
                <label><form:radiobutton path="gender" value="Female"/> Female</label>
            </div>
            <form:errors path="gender" cssClass="error"/>
        </div>

        <div class="form-group">
            <label>Address</label>
            <form:textarea path="address" placeholder="Address" rows="3"/>
        </div>

        <div class="button-group">
            <button type="button" class="btn-back" onclick="history.back()">Back</button>
            <c:choose>
                <c:when test="${employee != null and employee.id != null}">
                    <button type="submit" class="btn-submit">Update</button>
                </c:when>
                <c:otherwise>
                    <button type="submit" class="btn-submit">Register</button>
                </c:otherwise>
            </c:choose>
        </div>
    </form:form>
</div>
</body>
</html>
