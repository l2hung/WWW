package iuh.fit.se.tuan2.bai1;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AuthenticationFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession(false);

        if (session != null && session.getAttribute("user") != null) {
            chain.doFilter(request, response);
        } else {
            ((HttpServletResponse) response).sendRedirect("login.jsp");
        }
    }

    public void init(FilterConfig filterConfig) throws ServletException {}
    public void destroy() {}
}
