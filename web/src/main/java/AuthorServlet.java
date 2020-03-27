import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.io.PrintWriter;


public class AuthorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1> My name is " + getServletContext().getInitParameter("name") + "</h1>");
        printWriter.println("<h1> Data is  " + getServletContext().getInitParameter("data") + "</h1>");
        printWriter.println("<h1> My email " + getServletConfig().getInitParameter("email") + "</h1>");

    }

}
