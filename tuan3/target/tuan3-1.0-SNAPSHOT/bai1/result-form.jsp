<%@page import="fit.iuh.se.tuan3.bai1.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Submit</title>
</head>
<body>
	<%
	Student student = new Student();
	student = (Student) request.getAttribute("student");
	if (student != null) {
		out.println("First name: " + student.getFirstName() + "<br/>");
		out.println("Last Name: " + student.getLastName() + "<br/>");
		out.println("Email: " + student.getEmail() + "<br/>");
		out.println("Mobile Number: " + student.getMobileNumber() + "<br/>");
		out.println("Gender: " + student.getGender() + "<br/>");
		out.println("Date of Birth: " + student.getBirthDay() + "<br/>");
		out.println("Address: " + student.getAddress() + "<br/>");
		out.println("City: " + student.getCity() + "<br/>");
		out.println("Pin Code: " + student.getPinCode() + "<br/>");
		out.println("State: " + student.getState() + "<br/>");
		out.println("Country: " + student.getCountry() + "<br/>");

		out.println("Hobbies: ");
		if (student.getHobbies() != null) {
			for (String hobby : student.getHobbies()) {
		out.print(hobby + " ");
			}
		}

		out.println("Qualifications: <br/>");
		if (student.getQualifications() != null) {
			String[] qualifications = student.getQualifications();
			String[] percentages = student.getPercentages();
			String[] years = student.getPassingYears();
			for (int i = 0; i < qualifications.length; i++) {
		out.println("Qualification " + (i + 1) + ": " + qualifications[i] + ", " + percentages[i] + "%, Year: "
				+ years[i] + "<br/>");
			}
		}

		out.println("<br/>");

		out.println("Course Applied for: " + student.getCourse() + "<br/>");
	} else {
		out.println("Khong co thong tin.<br/>");
	}
	%>
</body>
</html>