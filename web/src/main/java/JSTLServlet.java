
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "JSTLServlet", urlPatterns = "/jstl")
public class JSTLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        request.setAttribute("attribute_1", "<h1>Привет всем</h1>");
        request.setAttribute("attribute_2", "<h1>Всем пока</h1>");
        request.setAttribute("price", "1000");
        request.getServletContext().getRequestDispatcher("/learnPage.jsp").forward(request,response);
    }

    @Override
    public void destroy() {}

}
