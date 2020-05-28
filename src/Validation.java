import java.io.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validation extends HttpServlet {
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();
      String name = request.getParameter("uname");
      String pass = request.getParameter("upass");
      if (name.equals("admin") && pass.equals("computer01")) {
         RequestDispatcher dis = request.getRequestDispatcher("welcome");
         dis.forward(request, response);
      } else {
         RequestDispatcher dis = request.getRequestDispatcher("index.html");
         pwriter.print("<h2 align='center'>Username or password is incorrect!</h2>");
         dis.include(request, response);
      }
   }
}