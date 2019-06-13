package simpleservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletTest", urlPatterns = {"/Servlet"})
public class ServletTest extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    response.setContentType("text/html");
    out.println("<html><head></head><body>");
    String name = request.getParameter("name");
    String color = request.getParameter("color");
    out.println("<h1>About you<h1>");
    out.println("<ul><li>Your name is: " + name + "</li>");
    out.println("<li>Your favorite color is: " + color + "</li></ul>");
    out.println("</body></html>");

  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }
}
