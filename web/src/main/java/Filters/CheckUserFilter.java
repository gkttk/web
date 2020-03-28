package Filters;

import com.myApp.User;
import com.myApp.UserService;
import com.myApp.api.IUserService;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/helloUser")
public class CheckUserFilter implements Filter {
    private IUserService iUserService;

    @Override
    public void init(FilterConfig filterConfig) {
        iUserService = UserService.getInstance();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String userName = req.getParameter("login");
        if (iUserService.checkUserInMap(userName)) {
            req.setAttribute("error", "The user already exists");
            RequestDispatcher rq = req.getServletContext().getRequestDispatcher("/registration.jsp");
            rq.forward(req, res);
        } else {
            iUserService.addUser(new User(userName, req.getParameter("password")));
                filterChain.doFilter(req,res);
        }
    }

    @Override
    public void destroy() {}

}








