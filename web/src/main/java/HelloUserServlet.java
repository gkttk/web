import com.myApp.User;
import com.myApp.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

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
        request.setAttribute("nameAuthUser", request.getParameter("login"));

        request.setAttribute("user", request.getParameter("login"));
        request.setAttribute("list", UserService.getUsers().keySet());
      getServletContext().getRequestDispatcher("/wage.jsp").forward(request,response);


      /*  PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1> Hello, " + request.getParameter("login") + "!</h1>");
        printWriter.println("<h1> Registered users: </h1>");

        UserService.getUsers().keySet().stream().forEach(user -> printWriter.println(user));*/

    }

    @Override
    public void destroy() {}

}
