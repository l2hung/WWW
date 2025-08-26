package fit.iuh.se.lehuyhung_21066381_tuan1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Servlet implementation class RegistrationForm
 */
public class RegistrationForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     */
    public RegistrationForm() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        request.getRequestDispatcher("RegistrationForm.html").forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName= request.getParameter("first-name");
        String lastName =request.getParameter("last-name");
        String userName =request.getParameter("username");
        String email = request.getParameter("email");
        String password= request.getParameter("password");
        String facebook = request.getParameter("facebook");
        String bio= request.getParameter("bio");
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(userName);
        System.out.println(email);
        System.out.println(password);
        System.out.println(facebook);
        System.out.println(bio);


        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String html="<br>"
                + "<head>"
                + "<html>"
                + "<title>Result Page</title>" + "<body>"
                + "First Name: "+firstName +"<br>"
                + "Last Name: " +lastName+"<br>"
                + "Username: "+userName+"<br>"
                +"E-mail" +email+"<br>"
                +"Password" +password+"<br>"
                +"Facebook"+facebook+"<br>"
                +"Short Bio"+bio+"<br>"
                + "</body>"
                + "</html>";

        out.println(html);
    }

}
