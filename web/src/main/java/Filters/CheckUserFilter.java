package Filters;

import com.myApp.User;
import com.myApp.UserService;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/helloUser")
public class CheckUserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String userName = req.getParameter("login");
        if (UserService.checkUserInMap(userName)) {
            req.setAttribute("error", "The user already exists");
            RequestDispatcher rq = req.getServletContext().getRequestDispatcher("/registration.jsp");
            rq.forward(req, res);
        } else {
            UserService.addUser(new User(userName, req.getParameter("password")));
                filterChain.doFilter(req,res);
        }


    }

    @Override
    public void destroy() {
    }

}


       /* if(requestLogin.equalsIgnoreCase(UserServic)){
            res.sendRedirect(contextPath + "/index.jsp");
           *//* RequestDispatcher rq = req.getServletContext().getRequestDispatcher(contextPath + "/index.jsp");
            rq.forward(req,res);*//*
        }



  *//*      if(User.login.equals(req.getParameter("login"))){
            res.sendRedirect(contextPath + "/index.jsp");
        }*//*
      else{
            filterChain.doFilter(servletRequest, servletResponse);
        }*/







