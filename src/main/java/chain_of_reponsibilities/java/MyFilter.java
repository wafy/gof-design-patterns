package chain_of_reponsibilities.java;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("구름아 잘 지내고 있지?");
        chain.doFilter(request, response);
        System.out.println("후처리");
    }
}
