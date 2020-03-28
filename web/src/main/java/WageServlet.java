
import com.myApp.WageService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "WageServlet", urlPatterns = "/wage")
public class WageServlet extends HttpServlet {

    private WageService wageService;

    @Override
    public void init() {
        wageService = WageService.getInstance();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        double wage = Double.parseDouble(request.getParameter("zarplata_f1"));
        double fszn = wageService.vszn(wage);
        double belgos = wageService.belgoz(wage);
        double podohod = wageService.podohodnyi(wage);
        double prof = wageService.prof(wage);
        double finalWage = wageService.checkWage(wage);


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
