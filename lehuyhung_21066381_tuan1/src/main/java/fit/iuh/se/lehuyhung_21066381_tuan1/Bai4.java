package fit.iuh.se.lehuyhung_21066381_tuan1;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Bai4 extends HttpServlet {
    private String servletConfigParam;
    private String contextParam;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);


        servletConfigParam = config.getInitParameter("servletConfig");


        ServletContext context = config.getServletContext();
        contextParam = context.getInitParameter("globalSetting");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Servlet Bai4</h1>");
        response.getWriter().println("<p>Init Param: " + servletConfigParam + "</p>");
        response.getWriter().println("<p>Context Param: " + contextParam + "</p>");
        response.getWriter().println("</body></html>");
    }
}
