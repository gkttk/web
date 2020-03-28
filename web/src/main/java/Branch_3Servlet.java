
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Branch_3Servlet", urlPatterns = "/branch")
public class Branch_3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();
        pw.println("Привет всем, я - сервлет, который не будут мержить");



    }

    @Override
    public void destroy() {}

}