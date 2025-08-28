package iuh.fit.se.tuan2.bai1;

import java.io.*;
import jakarta.servlet.*;
public class LoggingFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        System.out.println("Logging Filter: Request to " + request.getRemoteAddr());

        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {}
    public void destroy() {}
}
