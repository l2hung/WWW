package fit.iuh.se.tuan4.controller;

import fit.iuh.se.tuan4.dao.UserDAO;
import fit.iuh.se.tuan4.model.User;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String birthday = request.getParameter("birthday");

        User user = new User(firstName, lastName, email, password, gender, birthday);
        UserDAO.addUser(user);

        request.setAttribute("userList", UserDAO.getAllUsers());
        RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
        rd.forward(request, response);
    }
}
