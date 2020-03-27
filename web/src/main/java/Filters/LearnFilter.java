package Filters;

import com.myApp.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/jstl")
public class LearnFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        req.setAttribute("uz", new User("Sanya", "555"));
        filterChain.doFilter(req, res);


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







