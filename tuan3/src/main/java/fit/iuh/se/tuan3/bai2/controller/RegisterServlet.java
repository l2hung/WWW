package fit.iuh.se.tuan3.bai2.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fit.iuh.se.tuan3.bai2.entity.User;

@WebServlet("/bai2/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<User> listUser = new ArrayList<>();

	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("users", listUser);
		request.getRequestDispatcher("/bai2/Bai2.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String reEmail = request.getParameter("reemail");

		String dobDay = request.getParameter("dobDay");
		String dobMonth = request.getParameter("dobMonth");
		String dobYear = request.getParameter("dobYear");
		String gender = request.getParameter("gender");
		listUser.add(new User(firstName, lastName, email, reEmail, reEmail,dobDay, dobMonth, dobYear, gender));
		 request.setAttribute("users", listUser);
		request.getRequestDispatcher("/bai2/Bai2.jsp").forward(request, response);
	}

}
