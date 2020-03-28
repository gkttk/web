import com.myApp.UserService;
import com.myApp.api.IUserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CheckLogPassServlet", urlPatterns = "/checkLogPass")
public class CheckLogPassServlet extends HttpServlet {
    private IUserService iUserService;

    @Override
    public void init() {
        iUserService = UserService.getInstance();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");


      /*  HttpSession session = request.getSession();
        User userAuth = (User)session.getAttribute("userAuth");*/

       /* if (userAuth == null) {
            User user = new User(request.getParameter("login"), request.getParameter("password"));
            session.setAttribute("userAuth", user);
        }*/
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        if (iUserService.checkUserLogPass(login, password)) {
            request.getSession().setAttribute("user", login);
            request.getSession().setAttribute("list", iUserService.getUsers().keySet());
            getServletContext().getRequestDispatcher("/wage.jsp").forward(request, response);
        } else {
            request.setAttribute("errorLogPass", "Неверно введен логин или пароль");
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }

    }

    @Override
    public void destroy() {
    }

}
