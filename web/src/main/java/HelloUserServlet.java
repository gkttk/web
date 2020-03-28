import com.myApp.User;
import com.myApp.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "HelloUserServlet", urlPatterns = "/helloUser")
public class HelloUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

      /*  HttpSession session = request.getSession();
        User userAuth = (User)session.getAttribute("userAuth");*/

       /* if (userAuth == null) {
            User user = new User(request.getParameter("login"), request.getParameter("password"));
            session.setAttribute("userAuth", user);
        }*/


        HttpSession session = request.getSession();
        session.setAttribute("user", request.getParameter("login"));
        session.setAttribute("list", UserService.getUsers().keySet());
        getServletContext().getRequestDispatcher("/wage.jsp").forward(request,response);


    }

    @Override
    public void destroy() {}

}
