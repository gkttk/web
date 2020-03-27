import com.myApp.WageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "WageServlet", urlPatterns = "/wage")
public class WageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");


      /*  HttpSession session = request.getSession();
        User userAuth = (User)session.getAttribute("userAuth");*/

       /* if (userAuth == null) {
            User user = new User(request.getParameter("login"), request.getParameter("password"));
            session.setAttribute("userAuth", user);
        }*/
        double wage = Double.parseDouble(request.getParameter("zarplata_f1"));
        double fszn = WageService.vszn(wage);
        double belgos = WageService.belgoz(wage);
        double podohod = WageService.podohodnyi(wage);
        double prof = WageService.prof(wage);
        double finalWage = WageService.checkWage(wage);


        request.setAttribute("fszn", fszn);
        request.setAttribute("belgos", belgos);
        request.setAttribute("podohod", podohod);
        request.setAttribute("prof", prof);
        request.setAttribute("your_wage", finalWage);


        getServletContext().getRequestDispatcher("/wage.jsp").forward(request, response);

    }

    @Override
    public void destroy() {
    }

}
