package fit.iuh.se.tuan3.bai1.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import fit.iuh.se.tuan3.bai1.entity.Student;

@WebServlet("/registration-form")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public StudentServlet() {
		super();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Student student = new Student();
		student.setFirstName(request.getParameter("firstName"));
		student.setLastName(request.getParameter("lastName"));

//		String dobDay = request.getParameter("dobDay");
//		String dobMonth = request.getParameter("dobMonth");
//		String dobYear = request.getParameter("dobYear");
//		String birthDay = dobDay + dobMonth + dobYear;

		student.setBirthDay(
				request.getParameter("dobDay") + request.getParameter("dobMonth") + request.getParameter("dobYear"));
		student.setEmail(request.getParameter("email"));
		student.setMobileNumber(request.getParameter("mobileNumber"));
		student.setGender(request.getParameter("gender"));
		student.setAddress(request.getParameter("address"));

		student.setCity(request.getParameter("city"));
		student.setPinCode(request.getParameter("pinCode"));
		student.setState(request.getParameter("state"));
		student.setCountry(request.getParameter("country"));
		String[] hobbies = request.getParameterValues("hobbies");
		student.setHobbies(hobbies);

		student.setCourse(request.getParameter("course"));

		String[] qualifications = request.getParameterValues("board[]");
		student.setQualifications(qualifications);
		String[] percentages = request.getParameterValues("percentage[]");
		student.setPercentages(percentages);
		String[] years = request.getParameterValues("year[]");
		student.setPassingYears(years);

		request.setAttribute("student", student);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/bai1/result-form.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
