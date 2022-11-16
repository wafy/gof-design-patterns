package chain_of_reponsibilities.java;


import javax.servlet.*;
import java.io.IOException;

public class CorInJava {

    public static void main(String[] args) {
        Filter filter = new Filter(){
            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                // TODO: 2022/11/16 전처리
                chain.doFilter(request, response);
                // TODO: 2022/11/16 후처리
            }
        };
    }
}
