import com.myApp.UserService;
import com.myApp.api.IUserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "HelloUserServlet", urlPatterns = "/helloUser")
public class HelloUserServlet extends HttpServlet {

    private IUserService iUserService;

    @Override
    public void init() {
        iUserService = UserService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text/html");
        HttpSession session = request.getSession();
        session.setAttribute("user", request.getParameter("login"));
        session.setAttribute("list", iUserService.getUsers().keySet());
        getServletContext().getRequestDispatcher("/wage.jsp").forward(request,response);

    }

    @Override
    public void destroy() {}

}
